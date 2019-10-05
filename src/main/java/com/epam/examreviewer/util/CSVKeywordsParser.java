package com.epam.examreviewer.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
class CSVKeywordsParser {

  private Map<String, Double> keywordsMap;

  CSVKeywordsParser() {
    fillMapWithKeywordsFromFile(getCSVFromResources("keywords.csv"));
  }

  Map<String, Double> getKeywordsMap() {
    return keywordsMap;
  }

  private File getCSVFromResources(String fileName) {

    ClassLoader classLoader = getClass().getClassLoader();

    URL resource = classLoader.getResource(fileName);
    if (resource == null) {
      throw new IllegalArgumentException("File is not found!");
    } else {
      return new File(resource.getFile());
    }
  }

  private void fillMapWithKeywordsFromFile(File file) {

    String line = "";
    String cvsSplitBy = ",";
    BufferedReader br = null;

    try {
      br = new BufferedReader(new FileReader(file));
      while ((line = br.readLine()) != null) {
        String[] key = line.split(cvsSplitBy);
        keywordsMap.put(key[0], Double.valueOf(key[1]));
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

}
