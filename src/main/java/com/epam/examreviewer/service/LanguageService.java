package com.epam.examreviewer.service;

import com.epam.examreviewer.converter.LanguageConverter;
import com.epam.examreviewer.dto.LanguageDto;
import com.epam.examreviewer.model.Exam;
import com.epam.examreviewer.repository.ExamRepository;
import com.epam.examreviewer.repository.LanguageRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class LanguageService {

  private final ExamRepository examRepository;
  private final LanguageRepository languageRepository;

  public List<LanguageDto> getAllLanguages(Long examId) {
    return examRepository.findById(String.valueOf(examId))
        .map(Exam::getListOfLanguagesName)
        .map(languageRepository::findByNameIn)
        .map(LanguageConverter::toDto)
        .orElse(List.of());
  }

}
