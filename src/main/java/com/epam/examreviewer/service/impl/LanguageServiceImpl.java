package com.epam.examreviewer.service.impl;

import com.epam.examreviewer.model.Exam;
import com.epam.examreviewer.model.Language;
import com.epam.examreviewer.model.Topic;
import com.epam.examreviewer.service.LanguageService;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class LanguageServiceImpl implements LanguageService {

  @Override
  public List<Language> getAllLanguages(Exam examId){

    return new ArrayList<>();
  };


  @Override
  public List<Topic> getAllTopics(Exam examId, Language langId){
    return new ArrayList<>();
  };

}
