package com.telusko.SpringJDBCx;

import com.telusko.SpringJDBCx.model.Student;
import com.telusko.SpringJDBCx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbCxApplication {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(SpringJdbCxApplication.class, args);
		Student student = context.getBean(Student.class);
		student.setRoll_no(21);
		student.setMarks(100);
		student.setName("Sruthi");

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(student);
		List<Student> s = service.getStudent(student);
		System.out.println(s);



	}




}
