package com.telusko.spring_data_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.sound.midi.Soundbank;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		StudentRepo repo = context.getBean(StudentRepo.class);
		Student s1 =context.getBean(Student.class);
		Student s2 =context.getBean(Student.class);
		Student s3 =context.getBean(Student.class);

		s1.setRoll_no(1);
		s1.setName("Sruthi");
		s1.setMarks(82);

		s2.setRoll_no(2);
		s2.setName("Aiswarya");
		s2.setMarks(99);

		s3.setRoll_no(3);
		s3.setName("Shally.C.A");
		s3.setMarks(80);
//
//		repo.save(s1);
//		repo.save(s2);
		repo.save(s3);

/*		System.out.println(repo.findAll());

		Optional <Student> s= repo.findById(24);
		System.out.println(s.orElse(new Student()));//if null create new student object

		System.out.println(repo.findByName("Aiswarya"));
*/
//		System.out.println(repo.findByMarksGreaterThan(95));
		repo.delete(s1);//to delete

	}


}
