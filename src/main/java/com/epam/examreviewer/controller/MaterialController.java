package com.epam.examreviewer.controller;

import com.epam.examreviewer.model.Exam;
import com.epam.examreviewer.model.Material;
import com.epam.examreviewer.service.MaterialService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/material")
public class MaterialController {

  private MaterialService materialService;

  @GetMapping(value = "/{exam}/{topicId}")
  @ResponseStatus(HttpStatus.OK)
  public Material getMaterial(@PathVariable Exam exam, @PathVariable Long topicId) {
    return materialService.getMaterial(exam, topicId);
  }
}