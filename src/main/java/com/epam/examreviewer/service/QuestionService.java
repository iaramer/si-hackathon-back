package com.epam.examreviewer.service;

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

  public List<Question> getAllQuestions(String topicId) {
    List<String> questionIds = topicRepository
        .findById(topicId)
        .map(Topic::getQuestionIds)
        .orElse(Collections.emptyList());

    List<Question> questionList = new ArrayList<>();
    for (String questId : questionIds) {
      Question question = questionRepository.findById(questId).get();
      questionList.add(question);
    }
    return questionList;
  }
}