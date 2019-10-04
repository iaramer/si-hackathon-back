package com.epam.examreviewer.repository;

import com.epam.examreviewer.model.Answer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnswerRepository extends MongoRepository<Answer, Long> {

}
