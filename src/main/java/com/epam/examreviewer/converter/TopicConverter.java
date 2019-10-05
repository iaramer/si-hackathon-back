package com.epam.examreviewer.converter;

import com.epam.examreviewer.dto.TopicDto;
import com.epam.examreviewer.model.Topic;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TopicConverter {

  public static TopicDto toDto(Topic topic) {
    return new TopicDto(topic.getName(), topic.getLanguageId(), topic.getExamId());
  }

  public static List<TopicDto> toDto(List<Topic> topics) {
    return topics.stream()
        .map(TopicConverter::toDto)
        .collect(Collectors.toList());
  }
}
