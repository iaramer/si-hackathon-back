package com.epam.examreviewer;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class ExamReviewerApplication {

  public static void main(String[] args) {
    SpringApplication.run(ExamReviewerApplication.class, args);
  }
}
