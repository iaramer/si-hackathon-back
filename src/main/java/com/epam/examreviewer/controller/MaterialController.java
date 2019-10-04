package com.epam.examreviewer.controller;

import com.epam.examreviewer.model.Exam;
import com.epam.examreviewer.model.Material;
import com.epam.examreviewer.service.MaterialService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MaterialController {

  private final MaterialService materialService;

  @GetMapping("/material")
  @ResponseStatus(HttpStatus.OK)
  public Material getMaterial(@RequestParam Exam examId, @RequestParam Long topicId, @RequestParam Long langId) {
    return materialService.getMaterial(examId, topicId, langId);
  }
}