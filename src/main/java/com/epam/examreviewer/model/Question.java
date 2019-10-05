package com.epam.examreviewer.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {

  @Id
  private String id;

  private String questionText;

  private List<Topic> topics;
}
