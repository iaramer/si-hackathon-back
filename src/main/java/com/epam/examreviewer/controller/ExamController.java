package com.epam.examreviewer.controller;

import com.epam.examreviewer.model.Exam;
import com.epam.examreviewer.service.ExamService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ExamController {

  private final ExamService examService;

  @GetMapping("/exams")
  public List<Exam> getAll() {
    return examService.getAll();
  }
}
