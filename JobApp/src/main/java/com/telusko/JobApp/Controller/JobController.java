package com.telusko.JobApp.Controller;

import com.telusko.JobApp.model.JobPost;
import com.telusko.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {
    @Autowired
    private JobService service;

    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }

    @GetMapping("addjob")
    public String addjob(){
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost, Model model){
        model.addAttribute(jobPost);//to print it into the success page
        service.addJobPost(jobPost);
        return  "success";
    }

    @GetMapping("viewalljobs")
    public  String viewjob(Model model){
        List<JobPost> jobPost = service.returnAllJobs();
        model.addAttribute("jobPosts",jobPost);
        return "viewalljobs";
    }


}
