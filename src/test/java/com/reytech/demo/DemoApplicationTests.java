package com.reytech.demo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.reytech.demo.Personne;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}


	@Test

	void groupAssertions(){
		Personne pers = new Personne("owl","OWL");
		assertAll("peronne",()-> assertEquals("owl", pers.getFirstName()),
				() -> assertEquals("OWL",pers.getLastName()));
	}
}
