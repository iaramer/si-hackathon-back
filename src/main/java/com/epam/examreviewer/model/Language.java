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
  private String id;

  private LanguageType languageType;

  private String name;

  private String description;
}
