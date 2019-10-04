package com.epam.examreviewer.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document("languages")
public class Language {

  @Id
  private Long id;

  private LanguageType languageType;

  private String name;

  private String description;
}
