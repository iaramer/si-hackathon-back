package com.epam.examreviewer.service;

import com.epam.examreviewer.model.Exam;
import com.epam.examreviewer.model.Language;
import com.epam.examreviewer.model.Topic;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class LanguageService {

  public List<Language> getAllLanguages(Exam examId){

    return new ArrayList<>();
  }

  public List<Topic> getAllTopics(Exam examId, Language langId){
    return new ArrayList<>();
  }

}
