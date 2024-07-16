package com.teslusko.springboot_rest.service;


import com.teslusko.springboot_rest.model.JobPost;
import com.teslusko.springboot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepo repository;
    public void addJobPost(JobPost jobPost){
        repository.save(jobPost);
    }

    public List<JobPost> returnAllJobs() {
        return repository.findAll();
    }

    public Optional<JobPost> getjob(int postId) {
        return Optional.of(repository.findById(postId).orElse(new JobPost()));
    }

    public JobPost updateJob(JobPost jobPost) {
        return repository.save(jobPost);
    }

    public void deleteJob(int postId) {
        repository.deleteById(postId);
    }

    public void load(){

        List<JobPost> jobs = new ArrayList<>(List.of(
                new JobPost(1,"Java Developer","Must have good experience in core Java and advanced Java",2,
                        List.of("Core Java", "J2EE","Spring Boot","Hibernate")),

                new JobPost(2,"Frontend Developer","Experience in building responsive web applications using React",
                        3,List.of("HTML", "CSS","JavaScript","React")),
                new JobPost(3,"Data Scientist","Strong background in machine learning and data analysis",4,
                        List.of("Python", "Machine Learning","Data Analysis")),
                new JobPost(4,"Network Engineer",
                        "Design and implement computer networks for efficient data communication",5,
                        List.of("Networking", "Cisco","Routing","Switching"))
        ));
         repository.saveAll(jobs);
    }

    public List<JobPost> search(String keyword) {
         return repository.findByPostProfileContainingOrPostDescContaining(keyword,keyword);
    }
}
