package com.example.demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	
	@Test
	void contextLoads() {
		//初始化配置信息
		BasicConfigurator.configure();
		//获取日志记录器对象
		Logger logger = Logger.getLogger(DemoApplicationTests.class);
		logger.info("在哪儿呢");
	}
	
}
