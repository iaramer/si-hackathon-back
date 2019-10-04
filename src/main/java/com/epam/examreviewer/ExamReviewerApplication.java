package com.epam.examreviewer;

import com.epam.examreviewer.model.Answer;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
@RequiredArgsConstructor
public class ExamReviewerApplication implements CommandLineRunner {

	private final MongoTemplate mongoTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ExamReviewerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Answer answer = new Answer();
		answer.setId(2L);
		answer.setMark(111222L);
		answer.setStudentName("Danya2");

//		mongoTemplate.createCollection(Answer.class);
		mongoTemplate.insert(answer);
	}
}
