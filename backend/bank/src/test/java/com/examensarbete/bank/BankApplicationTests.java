package com.examensarbete.bank;

import com.examensarbete.bank.controller.HomeController;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BankApplicationTests {
	@Autowired
	private HomeController homeController;
	@DisplayName("Testing homeController class")
	@Test
	public void contextLoads() {
		assertThat(homeController).isNotNull();

	}

}
