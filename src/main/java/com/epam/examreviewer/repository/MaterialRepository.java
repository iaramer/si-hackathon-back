package com.epam.examreviewer.repository;

import com.epam.examreviewer.model.Material;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MaterialRepository extends MongoRepository<Material, Long> {

}
