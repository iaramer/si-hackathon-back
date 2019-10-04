package com.epam.examreviewer.util;

import java.util.Map;
import java.util.Random;

public class NLPMock {

  private static final double GRADE_COEFFICIENT = 1.2;

  public double evaluateAnswerText(String answerText, Map<String, Double> keywords) {

    int keywordsTotalAmount = keywords.size();
    double keywordsTotalWeight = keywords.values().stream().reduce(0.0, Double::sum);
    double answerTotalWeight = parseTextForKeywords() * GRADE_COEFFICIENT;


    return answerTotalWeight < 1 ? answerTotalWeight : 1.0;
  }

  // TODO: parse text in stream by splitting it to separate words and then sum all weights
  private double parseTextForKeywords() { // sum weights of keywords if they appear in answerText
    Random r = new Random();
    return r.nextDouble();
  }

}
