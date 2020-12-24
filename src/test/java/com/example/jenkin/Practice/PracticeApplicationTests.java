package com.example.jenkin.Practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PracticeApplicationTests {

	@Test
	public void Test1() {
		assertEquals(1, 1);
	}
	
	@Test
	void Test2() {
		assertEquals(2, 2);
	}
	
	@Test
	void Test3() {
		assertEquals(3, 3);
	}

}
