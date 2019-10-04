package com.epam.examreviewer.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public enum Exam {
  Evening,
  Lectures,
  Assessment
}
