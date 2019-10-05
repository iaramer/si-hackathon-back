package com.epam.examreviewer.service;

import com.epam.examreviewer.model.Answer;
import com.epam.examreviewer.repository.AnswerRepository;
import com.epam.examreviewer.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AnswerService {

  private final QuestionRepository questionRepository;
  private final AnswerRepository answerRepository;

  public Answer getAnswer(Long questionId) {
    String answerId = "";//String
//        .valueOf(questionRepository.findById(String.valueOf(questionId)).get().getAnswerId());

    return answerRepository.findById(answerId).get();
  }
}
