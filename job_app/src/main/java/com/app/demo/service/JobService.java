package com.app.demo.service;


import com.app.demo.DTO.JobDto;

import java.util.List;

public interface JobService {

    public JobDto createJob(JobDto jobDto);
    public JobDto getJobById(Long jobId);
    public List<JobDto> getAllJobs();
    public JobDto updateJob(JobDto jobDto);
    public void deleteJob(Long jobId);


}
