package com.epam.examreviewer.controller;

import com.epam.examreviewer.model.Answer;
import com.epam.examreviewer.service.AnswerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerController {

  private final AnswerService answerService;

  public AnswerController(AnswerService answerService) {
    this.answerService = answerService;
  }

  @PostMapping(value = "/answer")
  @ResponseStatus(HttpStatus.OK)
  public Answer getAnswer(@RequestHeader("id") Long id){
    return answerService.getAnswer(id);
  }
}
