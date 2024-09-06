package com.wls.dividendcalcservice;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wls.dividendcalcservice.controller.DividendController;

@SpringBootTest
class DividendCalcApplicationTests {

	//TODO: add tests

	@Autowired
	private DividendController controller;

	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

}
