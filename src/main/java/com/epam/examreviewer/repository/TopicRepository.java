package com.epam.examreviewer.repository;

import com.epam.examreviewer.model.Topic;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TopicRepository extends MongoRepository<Topic, String> {

  List<Topic> findByExamIdAndLanguageId(String examId, String languageId);
}
