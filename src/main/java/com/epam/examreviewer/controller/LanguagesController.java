package com.epam.examreviewer.controller;

import com.epam.examreviewer.model.Exam;
import com.epam.examreviewer.model.Language;
import com.epam.examreviewer.model.Topic;
import com.epam.examreviewer.service.LanguageService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LanguagesController {

  private final LanguageService languageService;

  @GetMapping(value = "/languages")
  @ResponseStatus(HttpStatus.OK)
  public List<Language> getAllLanguages(@RequestParam Exam examId) {
    return languageService.getAllLanguages(examId);
  }

  @GetMapping(value = "/topics")
  @ResponseStatus(HttpStatus.OK)
  public List<Topic> getAllTopics(@RequestParam Exam examId, @RequestParam Language langId) {
    return languageService.getAllTopics(examId, langId);
  }
}
