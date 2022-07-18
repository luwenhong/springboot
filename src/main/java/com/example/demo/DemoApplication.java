package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
主程序类
* @SpringBootApplication这是一个springboot应用
* */
@SpringBootApplication
public class DemoApplication {
	
	public static void main(String[] args) {
		//1.返回我们IOC容器
		ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
		
		//2.查看容器组件
		String[] beanDefinitionNames = run.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
	}
	
}
