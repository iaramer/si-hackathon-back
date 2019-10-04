package com.epam.examreviewer.model;

import java.util.List;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Material {

  @Id
  private long id;

  private String description;

  private List<String> materials;

  private List<String> topics;
}
