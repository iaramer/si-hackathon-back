package com.epam.examreviewer.service;

import com.epam.examreviewer.model.Exam;
import com.epam.examreviewer.model.Language;
import com.epam.examreviewer.model.Topic;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface LanguageService {
  List<Language> getAllLanguages(Exam examId);
  List<Topic> getAllTopics(Exam examId, Language langId);
}
