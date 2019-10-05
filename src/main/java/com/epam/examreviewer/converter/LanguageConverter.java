package com.epam.examreviewer.converter;

import com.epam.examreviewer.dto.LanguageDto;
import com.epam.examreviewer.model.Language;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LanguageConverter {

  private static LanguageDto toDto(Language language) {
    return new LanguageDto(language.getId(), language.getName(), language.getDescription());
  }

  public static List<LanguageDto> toDto(List<Language> languages) {
    return languages.stream()
        .map(LanguageConverter::toDto)
        .collect(Collectors.toList());
  }
}
