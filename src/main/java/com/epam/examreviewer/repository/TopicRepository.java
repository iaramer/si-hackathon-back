package com.epam.examreviewer.repository;

import com.epam.examreviewer.model.Topic;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TopicRepository extends MongoRepository<Topic, Long> {

  Optional<Topic> findByNameAndExamNameAndLanguageName(String topicName, String examName,
      String languageName);
}
