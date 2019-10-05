package com.epam.examreviewer.controller;

import com.epam.examreviewer.dto.AnswerDto;
import com.epam.examreviewer.dto.AnswerEvaluationDto;
import com.epam.examreviewer.service.AnswerService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AnswerController {

  private final AnswerService answerService;

  @PostMapping("/evaluatedAnswers")
  @ResponseStatus(HttpStatus.OK)
  public List<AnswerEvaluationDto> getAnswerResponse(@RequestBody AnswerDto answerDto) {
    return answerService.getEvaluatedAnswer(answerDto);
  }
}
