package com.epam.examreviewer.service;

import com.epam.examreviewer.model.Exam;
import com.epam.examreviewer.model.Material;
import com.epam.examreviewer.repository.MaterialRepository;
import java.util.List;
import java.util.NoSuchElementException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class MaterialService {

  private MaterialRepository materialRepository;

  public Material getMaterial(Exam examId, Long topicId, Long langId) {
    List<Material> materials = materialRepository.findAll();

    return materials.stream()
        .filter(material -> material.getTopics().stream()
            .filter(topic -> topic.getExam().equals(examId))
            .anyMatch(topic -> topic.getId().equals(topicId)))
        .findFirst().orElseThrow(NoSuchElementException::new);
  }

}
