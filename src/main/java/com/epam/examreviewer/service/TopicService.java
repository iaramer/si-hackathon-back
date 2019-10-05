package com.epam.examreviewer.service;

import com.epam.examreviewer.converter.TopicConverter;
import com.epam.examreviewer.dto.TopicDto;
import com.epam.examreviewer.repository.TopicRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TopicService {

  private final TopicRepository topicRepository;

  public List<TopicDto> getTopics(Long examId, Long languageId) {
    return topicRepository
        .findByExamIdAndLanguageId(String.valueOf(examId), String.valueOf(languageId)).stream()
        .map(TopicConverter::toDto)
        .collect(Collectors.toList());
  }
}
