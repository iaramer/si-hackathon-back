package com.epam.examreviewer.repository;

import com.epam.examreviewer.model.Topic;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TopicRepository extends MongoRepository<Topic, Long> {

}
