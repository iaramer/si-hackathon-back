package com.epam.examreviewer.controller;

import com.epam.examreviewer.model.Exam;
import com.epam.examreviewer.model.Language;
import com.epam.examreviewer.model.Topic;
import com.epam.examreviewer.service.LanguageService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/languages")
public class LanguagesController {

  private final LanguageService languageService;

  public LanguagesController(LanguageService languageService) {
    this.languageService = languageService;
  }

  @GetMapping(value = "/all_languages")
  @ResponseStatus(HttpStatus.OK)
  public List<Language> getAllLanguages(@PathVariable Exam examId) {
    return languageService.getAllLanguages(examId);
  }

  @GetMapping(value = "/all_topics")
  @ResponseStatus(HttpStatus.OK)
  public List<Topic> getAllTopics(@PathVariable Exam examId, @PathVariable Language langId) {
    return languageService.getAllTopics(examId, langId);
  }
}
