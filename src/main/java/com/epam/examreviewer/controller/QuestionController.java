package com.epam.examreviewer.controller;

import com.epam.examreviewer.model.Question;
import com.epam.examreviewer.service.QuestionService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class QuestionController {

  private final QuestionService questionService;

  @GetMapping("/questions")
  public List<Question> getAllQuestion(@RequestParam String topicId) {
    return questionService.getAllQuestions(topicId);
  }

  @PostMapping("/question")
  public Question createQuestion(@RequestBody Question question) {
    return questionService.saveQuestion(question);
  }

}
