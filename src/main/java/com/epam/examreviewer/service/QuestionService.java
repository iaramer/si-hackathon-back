package com.epam.examreviewer.service;

import com.epam.examreviewer.model.Exam;
import com.epam.examreviewer.model.Question;
import com.epam.examreviewer.repository.QuestionRepository;
import java.util.List;
import java.util.NoSuchElementException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class QuestionService {

  private QuestionRepository questionRepository;

  public Question getRandomQuestion(Exam exam, Long topicId) {
    List<Question> questions = questionRepository.findAll();

    return questions.stream()
        .filter(question -> question.getTopics().stream()
            .filter(topic -> topic.getExam().equals(exam))
            .anyMatch(topic -> topic.getId().equals(topicId)))
        .findFirst().orElseThrow(NoSuchElementException::new);
  }
}