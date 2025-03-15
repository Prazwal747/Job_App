package com.app.demo.controller;

import com.app.demo.DTO.JobDto;
import com.app.demo.module.Job;
import com.app.demo.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class JobController {

    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping("/create")
    public JobDto createJob(@RequestBody JobDto jobDto){
        return jobService.createJob(jobDto);
    }

    @GetMapping("/getJob")
    public JobDto getJobById(@RequestParam Long jobId){
        return  jobService.getJobById(jobId);
    }

    @GetMapping("/getAllJobs")
    public List<JobDto> getAllJobs(){
        return jobService.getAllJobs();
    }

    @PostMapping("/updateJob")
    public JobDto updateJob(@RequestBody JobDto jobDto){
        return jobService.updateJob(jobDto);
    }

    @DeleteMapping("/deleteJob")
    public void deleteJob(@RequestParam Long jobId){
        jobService.deleteJob(jobId);
    }
}
