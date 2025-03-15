package com.app.demo.Mapper;

import com.app.demo.DTO.JobDto;
import com.app.demo.module.Job;

public class JobMapper {

    public static JobDto convertToJobDto(Job job) {
        return new JobDto(job.getJobId(), job.getCompany(), job.getRole(), job.getSalary());
    }

    public static Job convertToJob(JobDto jobDto){
        return new Job(jobDto.getJobId(), jobDto.getCompany(), jobDto.getRole(), jobDto.getSalary());
    }

}
