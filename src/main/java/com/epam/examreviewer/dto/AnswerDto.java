package com.epam.examreviewer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnswerDto {

  private Long answerId;

  private String studentName;

  private String answerText;
}
