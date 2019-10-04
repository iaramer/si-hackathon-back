package com.epam.examreviewer.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Answer {

  @Id
  private Long id;

  private String studentName;

  private long mark;
}
