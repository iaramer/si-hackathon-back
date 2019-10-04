package com.epam.examreviewer.repository;

import com.epam.examreviewer.model.Language;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LanguageRepository extends MongoRepository<Language, Long> {

}
