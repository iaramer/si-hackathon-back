package com.epam.examreviewer.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Material {

  @Id
  private long id;

  private String description;

  private List<String> materialLinks;

  private List<Topic> topics;
}
