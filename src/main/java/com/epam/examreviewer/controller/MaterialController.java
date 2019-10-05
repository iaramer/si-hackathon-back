package com.epam.examreviewer.controller;

import com.epam.examreviewer.dto.MaterialDto;
import com.epam.examreviewer.service.MaterialService;
import java.util.List;
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

  @GetMapping("/materials")
  @ResponseStatus(HttpStatus.OK)
  public List<MaterialDto> getMaterials(
      @RequestParam Long topicId) { //@RequestParam Exam examId, @RequestParam Long topicId, @RequestParam Long langId
    return materialService.getMaterials(topicId);
  }
}