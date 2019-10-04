package com.epam.examreviewer.controller;

import com.epam.examreviewer.model.Material;
import com.epam.examreviewer.service.MaterialService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/material")
public class MaterialController {

  private MaterialService materialService;

  @GetMapping(value = "/{examId}")
  public Material getMaterial(@PathVariable Integer examId) {
    return materialService.getMaterial();
  }
}