package com.epam.examreviewer.service;

import com.epam.examreviewer.converter.MaterialConverter;
import com.epam.examreviewer.dto.MaterialDto;
import com.epam.examreviewer.model.Topic;
import com.epam.examreviewer.repository.MaterialRepository;
import com.epam.examreviewer.repository.TopicRepository;
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
  private final TopicRepository topicRepository;

  public List<MaterialDto> getMaterials(Long topicId) {
    return topicRepository.findById(String.valueOf(topicId))
        .map(Topic::getMaterialIds)
        .map(materialRepository::findByIdIn)
        .map(MaterialConverter::toDto)
        .orElseThrow(NoSuchElementException::new);
  }

}
