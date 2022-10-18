package com.example.demo;

import com.example.demo.service.ListInitService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudyApplicationTests {

	@Autowired
	public ListInitService listInitService;
	@Test
	void contextLoads() {
		listInitService.sellectAll();
	}

}
