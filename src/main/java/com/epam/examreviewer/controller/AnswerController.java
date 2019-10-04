package com.epam.examreviewer.controller;

import com.epam.examreviewer.model.Answer;
import com.epam.examreviewer.service.AnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AnswerController {

  private final AnswerService answerService;

  @PostMapping("/answer")
  @ResponseStatus(HttpStatus.OK)
  public Answer getAnswer(@RequestHeader("id") Long id){
    return answerService.getAnswer(id);
  }
}
