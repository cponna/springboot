package com.mondee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootMainLogic {

	public static void main(String[] args) {

		ConfigurableApplicationContext ac = SpringApplication.run(SpringBootMainLogic.class,args);

		StudentDao sd = ac.getBean(StudentDao.class,args);

		Student st = new Student();
		st.setId(664);
		st.setMarks(890);
		st.setName("Alice");

		sd.insert(st);

	}

}