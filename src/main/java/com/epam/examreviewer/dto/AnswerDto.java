package com.epam.examreviewer.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnswerDto {

  private String studentName;

  private List<AnswerItem> answers;
}
