package com.epam.examreviewer.converter;

import com.epam.examreviewer.dto.QuestionDto;
import com.epam.examreviewer.dto.TopicDto;
import com.epam.examreviewer.model.Question;
import com.epam.examreviewer.model.Topic;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class QuestionConverter {

  private static QuestionDto toDto(Question question) {
    return new QuestionDto(question.getId(), question.getQuestionText());
  }

  public static List<QuestionDto> toDto(List<Question> topics) {
    return topics.stream()
        .map(QuestionConverter::toDto)
        .collect(Collectors.toList());
  }
}
