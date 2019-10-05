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
@Document("topic")
public class Topic {

  @Id
  private String id;

  private String name;

  private String description;

  private String languageId;

  private String examId;

  private List<String> materialIds;

  private List<String> questionIds;
}
