package com.epam.examreviewer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnswerEvaluationDto {

  private String questionId;

  private Long mark;

  private String markText;
}
