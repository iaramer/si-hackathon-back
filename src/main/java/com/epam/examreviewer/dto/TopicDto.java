package com.epam.examreviewer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TopicDto {

  private String topicName;

  private String languageId;

  private String examId;
}
