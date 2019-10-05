package com.epam.examreviewer.service;

import com.epam.examreviewer.model.Answer;
import com.epam.examreviewer.repository.AnswerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AnswerService {

  private final AnswerRepository answerRepository;

  public Answer getAnswer(Long id){
    return answerRepository.findById(String.valueOf(id)).get();
  }
}
