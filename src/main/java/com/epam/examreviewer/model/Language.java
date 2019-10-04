package com.epam.examreviewer.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("languages")
public class Language {

  private LanguageType languageType;

  private String name;

  private String description;
}
