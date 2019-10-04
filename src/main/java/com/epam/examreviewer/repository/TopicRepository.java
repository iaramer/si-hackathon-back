package com.epam.examreviewer.repository;

import com.epam.examreviewer.model.ExamType;
import com.epam.examreviewer.model.Language;
import com.epam.examreviewer.model.Topic;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TopicRepository extends MongoRepository<Topic, Long> {

  List<Topic> findByLangAndExam(ExamType exam, Language lang);
}
