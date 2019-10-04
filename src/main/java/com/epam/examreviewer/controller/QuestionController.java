package com.epam.examreviewer.controller;

import com.epam.examreviewer.model.Question;
import com.epam.examreviewer.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/question")
public class QuestionController {

  private QuestionService questionService;

  @GetMapping(value = "/{questionId}")
  public Question getMaterial(@PathVariable Integer questionId) {
    return questionService.getRandomQuestion();
  }

}
