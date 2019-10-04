package com.epam.examreviewer.service;

import com.epam.examreviewer.model.Material;
import org.springframework.stereotype.Service;

@Service
public class MaterialService {

  public Material getMaterial() {
    return new Material();
  }

}
