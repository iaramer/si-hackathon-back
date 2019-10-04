package com.epam.examreviewer.repository;

import com.epam.examreviewer.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {

}
