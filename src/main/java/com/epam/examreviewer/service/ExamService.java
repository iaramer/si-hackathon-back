package com.epam.examreviewer.service;

import com.epam.examreviewer.model.Exam;
import com.epam.examreviewer.repository.ExamRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExamService {

  private final ExamRepository examRepository;

  public List<Exam> getAll(){
    return examRepository.findAll();
  }
}

