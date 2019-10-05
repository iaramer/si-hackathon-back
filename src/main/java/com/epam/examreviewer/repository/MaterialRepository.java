package com.epam.examreviewer.repository;

import com.epam.examreviewer.model.Material;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MaterialRepository extends MongoRepository<Material, Long> {

  List<Material> findByIdIn(List<Long> materialIds);
}
