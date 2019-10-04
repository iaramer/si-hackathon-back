package com.epam.examreviewer.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "topic")
public class Topic {

  @Id
  private Long id;

  private String name;

  private String description;

  private Language language;

  private Exam exam;

  private List<Long> materialId;

  private List<Long> questionId;
}
