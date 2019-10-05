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
@Document("material")
public class Material {

  @Id
  private String id;

  private String description;

  private List<String> materialLinks;

  private List<String> topicIds;
}
