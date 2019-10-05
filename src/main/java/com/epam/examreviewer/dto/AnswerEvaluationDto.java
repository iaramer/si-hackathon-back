package com.epam.examreviewer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnswerEvaluationDto {

  private Long answerId;

  private Long mark;
}
