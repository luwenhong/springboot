package com.example.demo.config;

import com.example.demo.pojo.Pet;
import com.example.demo.pojo.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({User.class})//给容器中自动创建出这个类型的组件，调用无参构造函数，默认组件名为全类名
@Configuration  //告訴springboot這是一個配置類===配置文件
public class MyConfig {
	
	@ConditionalOnBean(Pet.class)   //当容器中有pet类时才注册user01
	@Bean
	//给容器中添加组件，以方法名作为组件的id（也可以在bean中另取名字），返回类型就是组件类型
	//返回值，就是组件在容器中的实例
	public User user01(){
		return new User("lwn",18);
	}
	
	@Bean
	public Pet pet(){
		return new Pet("dog");
}}
