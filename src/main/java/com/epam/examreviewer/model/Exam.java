package com.epam.examreviewer.model;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("exams")
public class Exam {

  @Id
  private Long id;

  private String name;

  private ExamType examType;

  private String description;

  private List<String> listOfLanguagesName;
}
