package com.telusko.SpringJDBCx.service;

import com.telusko.SpringJDBCx.model.Student;
import com.telusko.SpringJDBCx.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository repo;

    public StudentRepository getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudentRepository repo) {
        this.repo = repo;
    }

    public void addStudent(Student student) {
        repo.save(student);
    }
    public  List<Student> getStudent( Student student){
        return repo.findAll(student);
    }
}
