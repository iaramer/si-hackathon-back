package com.epam.examreviewer.service;

import com.epam.examreviewer.model.Question;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

  public Question getRandomQuestion() {
    return new Question();
  }
}