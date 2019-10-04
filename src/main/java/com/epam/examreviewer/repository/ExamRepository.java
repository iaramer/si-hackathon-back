package com.epam.examreviewer.repository;

import com.epam.examreviewer.model.Exam;
import com.epam.examreviewer.model.ExamType;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExamRepository extends MongoRepository<Exam, Long> {

  Optional<Exam> findByExamType(ExamType examType);
}
