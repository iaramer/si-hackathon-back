package com.epam.examreviewer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("answer")
public class Answer {

  @Id
  private String id;

  private String studentName;

  private long mark;

  private String answerText;

  private String questionId;
}
