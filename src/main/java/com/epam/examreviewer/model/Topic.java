package com.epam.examreviewer.model;

import java.util.List;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "topic")
public class Topic {

  @Id
  private long id;

  private String name;

  private String description;

  private Language lang;

  private Exam exam;

  private List<Long> materialId;

  private List<Long> questionId;
}
