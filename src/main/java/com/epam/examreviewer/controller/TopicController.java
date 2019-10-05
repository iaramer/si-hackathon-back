package com.epam.examreviewer.controller;

import com.epam.examreviewer.dto.TopicDto;
import com.epam.examreviewer.model.Topic;
import com.epam.examreviewer.service.TopicService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TopicController {

  private final TopicService topicService;

  @GetMapping("/topics")
  @ResponseStatus(HttpStatus.OK)
  public List<TopicDto> getTopics(@RequestParam Long examId, @RequestParam Long languageId) {
    return topicService.getTopics(examId, languageId);
  }

  @GetMapping("/allTopics")
  @ResponseStatus(HttpStatus.OK)
  public List<TopicDto> getAllTopics() {
    return topicService.getAllTopics();
  }

  @PostMapping("/topic")
  public Topic createTopic(@RequestBody Topic topic) {
    return topicService.createTopic(topic);
  }
}
