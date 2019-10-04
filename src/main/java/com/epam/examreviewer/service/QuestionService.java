package com.epam.examreviewer.service;

import com.epam.examreviewer.model.ExamType;
import com.epam.examreviewer.model.Question;
import com.epam.examreviewer.repository.QuestionRepository;
import java.util.List;
import java.util.NoSuchElementException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class QuestionService {

  private QuestionRepository questionRepository;

  public Question getRandomQuestion(ExamType exam, Long topicId) {
    List<Question> questions = questionRepository.findAll();

    return questions.stream()
        .filter(question -> question.getTopics().stream()
            .filter(topic -> topic.getExam().equals(exam))
            .anyMatch(topic -> topic.getId().equals(topicId)))
        .findFirst().orElseThrow(NoSuchElementException::new);
  }

  public Question saveQuestion(Question question) {
    return questionRepository.save(question);
  }

  public List<Question> getAllQuestions() {
    return questionRepository.findAll();
  }
}