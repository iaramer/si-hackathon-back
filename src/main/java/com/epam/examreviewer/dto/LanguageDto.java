package com.epam.examreviewer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LanguageDto {

  private Long id;

  private String name;

  private String description;
}
