package com.epam.examreviewer.model;

import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "answer")
public class Answer {

  @Id
  private Long id;

  private String studentName;

  private long mark;
}
