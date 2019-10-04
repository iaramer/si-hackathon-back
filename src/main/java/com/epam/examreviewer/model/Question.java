package com.epam.examreviewer.model;

import java.util.List;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {

  @Id
  private long id;

  private String questionText;

  private List<Topic> topics;
}
