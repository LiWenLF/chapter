package com.faisco;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class Chapter1ApplicationTests {
	@Test
	public void contextLoads() {
		log.info("hello world");
		log.debug("hello world test");
		log.error("hello world2");
		System.out.print("hello world");
	}
}
