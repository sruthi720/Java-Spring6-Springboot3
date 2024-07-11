package com.teslusko.springboot_rest.service;


import com.teslusko.springboot_rest.model.JobPost;
import com.teslusko.springboot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo repository;
    public void addJobPost(JobPost jobPost){
        repository.addJobPost(jobPost);
    }

    public List<JobPost> returnAllJobs() {
        return repository.returAllJobs();
    }

    public JobPost getjob(int postId) {
        return repository.getjob(postId);
    }

    public JobPost updateJob(JobPost jobPost) {
        return repository.updateJob(jobPost);
    }

    public void deleteJob(int postId) {
        repository.deleteJob(postId);
    }
}
