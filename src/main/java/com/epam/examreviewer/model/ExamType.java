package com.epam.examreviewer.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public enum ExamType {
  Evening,
  Lectures,
  Assessment
}
