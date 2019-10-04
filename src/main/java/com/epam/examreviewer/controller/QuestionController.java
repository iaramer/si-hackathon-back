package com.epam.examreviewer.controller;

import com.epam.examreviewer.model.Exam;
import com.epam.examreviewer.model.Question;
import com.epam.examreviewer.service.QuestionService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/question")
public class QuestionController {

  private QuestionService questionService;

  @GetMapping(value = "/{exam}/{topicId}")
  @ResponseStatus(HttpStatus.OK)
  public Question getQuestion(@PathVariable Exam exam, @PathVariable Long topicId) {
    return questionService.getRandomQuestion(exam, topicId);
  }

  @PostMapping(value = "")
  public Question createQuestion(@RequestBody Question question) {
    return questionService.saveQuestion(question);
  }

  @GetMapping(value = "")
  public List<Question> getAllQuestion() {
    return questionService.getAllQuestions();
  }

}
