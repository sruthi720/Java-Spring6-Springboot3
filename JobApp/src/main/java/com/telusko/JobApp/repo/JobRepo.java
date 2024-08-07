package com.telusko.JobApp.repo;

import com.telusko.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>();



    public  JobRepo(){
    // Java Developer Job Post
		jobs.add(new JobPost(1,"Java Developer","Must have good experience in core Java and advanced Java",2,
            List.of("Core Java", "J2EE","Spring Boot","Hibernate")));

    // Frontend Developer Job Post
		jobs.add(
                new

    JobPost(2,"Frontend Developer","Experience in building responsive web applications using React",
                    3,List.of("HTML", "CSS","JavaScript","React")));

    // Data Scientist Job Post
		jobs.add(new

    JobPost(3,"Data Scientist","Strong background in machine learning and data analysis",4,
            List.of("Python", "Machine Learning","Data Analysis")));

    // Network Engineer Job Post
		jobs.add(new

    JobPost(4,"Network Engineer",
                    "Design and implement computer networks for efficient data communication",5,
            List.of("Networking", "Cisco","Routing","Switching")));
}


    public void addJobPost(JobPost jobPost) {
        jobs.add(jobPost);
        System.out.println(jobs);
    }

    public List<JobPost> returAllJobs() {
        return jobs;
    }
}
