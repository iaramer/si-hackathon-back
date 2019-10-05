package com.epam.examreviewer.converter;

import com.epam.examreviewer.dto.MaterialDto;
import com.epam.examreviewer.model.Material;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MaterialConverter {

  private static MaterialDto toDto(Material material) {
    return new MaterialDto(Long.valueOf(material.getId()), material.getDescription(), material.getMaterialLinks());
  }

  public static List<MaterialDto> toDto(List<Material> materials) {
    return materials.stream()
        .map(MaterialConverter::toDto)
        .collect(Collectors.toList());
  }
}
