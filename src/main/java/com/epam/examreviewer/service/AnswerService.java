package com.epam.examreviewer.service;

import com.epam.examreviewer.dto.AnswerDto;
import com.epam.examreviewer.dto.AnswerEvaluationDto;
import com.epam.examreviewer.dto.AnswerItem;
import com.epam.examreviewer.model.Answer;
import com.epam.examreviewer.model.Material;
import com.epam.examreviewer.model.Question;
import com.epam.examreviewer.repository.AnswerRepository;
import com.epam.examreviewer.repository.MaterialRepository;
import com.epam.examreviewer.repository.QuestionRepository;
import com.epam.examreviewer.util.NLPMock;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AnswerService {

  private final QuestionRepository questionRepository;
  private final AnswerRepository answerRepository;
  private final MaterialRepository materialRepository;
  private final NLPMock nlpMock;

  public List<AnswerEvaluationDto> getEvaluatedAnswer(AnswerDto answerDto) {

    List<AnswerItem> answerItemList = answerDto.getAnswers();
    List<AnswerEvaluationDto> answerEvaluationDtoList = new ArrayList<>();

    for (AnswerItem answerItem : answerItemList) {
      String answerText = answerItem.getAnswer();

      Question question = questionRepository.findById(answerItem.getQuestionId()).orElseThrow(
          NoSuchElementException::new);
      Material material = materialRepository.findById(question.getMaterialId()).orElseThrow(
          NoSuchElementException::new);

      String referenceText = material.getMaterialLinks().get(0);

      long mark = Math.round(100 * nlpMock.evaluateAnswerText(answerText, referenceText));
      String markText;
      if (mark > 75) {
        markText = "Great, excellent understanding of topic";
      } else if (mark > 50) {
        markText = "Good understanding, we recommend to clarify some details";
      } else if (mark > 25) {
        markText = "Weak understanding of the topic";
      } else {
        markText = "Total lack of question understanding";
      }
      AnswerEvaluationDto answerEvaluationDto = new AnswerEvaluationDto(question.getId(), mark,
          markText);

      Answer answer = new Answer();
      answer.setStudentName(answerDto.getStudentName());
      answer.setMark(mark);
      answer.setAnswerText(answerItem.getAnswer());

      answerRepository.save(answer);
      answerEvaluationDtoList.add(answerEvaluationDto);
    }

    return answerEvaluationDtoList;
  }
}
