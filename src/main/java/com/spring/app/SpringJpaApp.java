package com.spring.app;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AppConfig;
import com.spring.entity.UserEntity;
import com.spring.service.UserService;

public class SpringJpaApp {
	public static void main(String[] args) {
	    AnnotationConfigApplicationContext context = 
	            new AnnotationConfigApplicationContext(AppConfig.class);

	      UserService userService = context.getBean(UserService.class);

	      userService.newUser(new UserEntity("Harish Manana", "New Delhi"));
	      userService.newUser(new UserEntity("Nbj", "New Delhi"));

	      List<UserEntity> allUsers = userService.getAll();
	      for (UserEntity user : allUsers) {
	         System.out.println (user);
	      }
	      context.close();
	}

}
