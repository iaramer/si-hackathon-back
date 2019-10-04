package com.epam.examreviewer.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Topics {

  private long id;

  private String name;

  private String description;

  private Language lang;

  private Exam exam;

  private Material material;

  private List<String> questions;
}
