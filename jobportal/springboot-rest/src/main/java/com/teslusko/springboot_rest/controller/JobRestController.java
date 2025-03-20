package com.teslusko.springboot_rest.controller;

import com.teslusko.springboot_rest.model.JobPost;
import com.teslusko.springboot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {
    @Autowired
    private JobService service;

    @GetMapping(path ="jobpost", produces = "application/xml")
    public List<JobPost> returnAllJobs(){
        return service.returnAllJobs();
    }

    @GetMapping("jobpost/{postId}")
    public Optional<JobPost> getJob(@PathVariable() int postId){
        return service.getjob(postId);
    }

    @PostMapping("jobpost")
    public void addJob(@RequestBody JobPost jobPost){//to accept and set  json data  value in jobpost @Reqeustbody
        service.addJobPost(jobPost);
    }

    @PutMapping("jobpost")
    public Optional<JobPost> updateJob(@RequestBody JobPost jobPost){
         service.updateJob(jobPost);
         return getJob(jobPost.getPostId());

    }

    @DeleteMapping("jobpost/{postId}")
    public String deleteJob(@PathVariable("postId") int postId){
        service.deleteJob(postId);
        return "Deleted";
    }

    @GetMapping("jobpost/search/{keyword}")
    public  List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword){
        return service.search(keyword);
    }

    @GetMapping("load")
    public String loadData(){
        service.load();
      return "Success";
    }
}
