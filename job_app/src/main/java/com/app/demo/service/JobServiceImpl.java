package com.app.demo.service;

import com.app.demo.DTO.JobDto;
import com.app.demo.Mapper.JobMapper;
import com.app.demo.module.Job;
import com.app.demo.repository.JobRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobServiceImpl implements JobService {

    private JobRepo jobRepo;

    public JobRepo getJobRepo() {
        return jobRepo;
    }

    public void setJobRepo(JobRepo jobRepo) {
        this.jobRepo = jobRepo;
    }

    public JobServiceImpl(JobRepo jobRepo){
        this.jobRepo = jobRepo;
    }

    @Override
    public JobDto createJob(JobDto jobDto) {
        Job job = JobMapper.convertToJob(jobDto);
        Job savedJob = jobRepo.save(job);
        return JobMapper.convertToJobDto(job);
    }

    @Override
    public JobDto getJobById(Long jobId) {
        Job job = jobRepo.findById(jobId).
                orElseThrow(()->new RuntimeException("Job not found with provided Id"));
        return JobMapper.convertToJobDto(job);
    }

    @Override
    public List<JobDto> getAllJobs() {
        List<Job> jobList = jobRepo.findAll();
        return jobList.stream().map(job -> JobMapper.convertToJobDto(job)).collect(Collectors.toList());
    }

    @Override
    public JobDto updateJob(JobDto jobDto) {
        Job job = jobRepo.findById(jobDto.getJobId()).orElseThrow(()->new RuntimeException("Not Found"));
        job = JobMapper.convertToJob(jobDto);
        jobRepo.save(job);
        return jobDto;
    }

    @Override
    public void deleteJob(Long jobId) {
        Job job = jobRepo.findById(jobId).orElseThrow(()->new RuntimeException("Not Found"));
        jobRepo.deleteById(jobId);
    }
}
