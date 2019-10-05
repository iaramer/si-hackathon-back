package com.epam.examreviewer.service;

import com.epam.examreviewer.converter.QuestionConverter;
import com.epam.examreviewer.dto.QuestionDto;
import com.epam.examreviewer.model.Question;
import com.epam.examreviewer.model.Topic;
import com.epam.examreviewer.repository.QuestionRepository;
import com.epam.examreviewer.repository.TopicRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class QuestionService {

  private final QuestionRepository questionRepository;
  private final TopicRepository topicRepository;

  public Question saveQuestion(Question question) {
    return questionRepository.save(question);
  }

  public List<QuestionDto> getAllQuestions(Long topicId) {
    return topicRepository
        .findById(String.valueOf(topicId))
        .map(Topic::getQuestionIds)
        .map(questionRepository::findByIdIn)
        .map(QuestionConverter::toDto)
        .orElse(List.of());
  }
}