package com.epam.examreviewer.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class NLPMock {

  private static final double DISPERSION_COEFFICIENT = 1.2;
  private Map<String, Double> keywords;

  public NLPMock(CSVKeywordsParser csvKeywordsParser) {
    keywords = csvKeywordsParser.getKeywordsMap();
  }

  public double evaluateAnswerText(String answerText, String referenceText) {

    Set<String> answerWordSet = new HashSet<>(
        Arrays.asList(answerText.trim().toLowerCase().split(" ")));
    Set<String> referenceWordSet = new HashSet<>(
        Arrays.asList(referenceText.trim().toLowerCase().split(" ")));
    double answerTotalWeight =
        DISPERSION_COEFFICIENT * evaluateWeightOfText(answerWordSet, keywords);
    double referenceTotalWeight = evaluateWeightOfText(referenceWordSet, keywords);
    double mark = answerTotalWeight / referenceTotalWeight;

    return mark < 1 ? mark : 1.0;
  }

  private double evaluateWeightOfText(Set<String> wordSet, Map<String, Double> keywords) {
    return wordSet.stream()
        .filter(keywords::containsKey)
        .map(keywords::get)
        .reduce(0.0, Double::sum);
  }

}
