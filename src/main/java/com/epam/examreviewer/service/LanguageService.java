package com.epam.examreviewer.service;

import com.epam.examreviewer.model.Exam;
import com.epam.examreviewer.model.Language;
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

  private final LanguageRepository languageRepository;
  private final ExamRepository examRepository;

  public List<Language> getAllLanguages(Exam examId) {

    return languageRepository.findAll();
  }

}
