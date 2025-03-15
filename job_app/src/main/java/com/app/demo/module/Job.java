package com.app.demo.module;

import jakarta.persistence.*;

@Entity
@Table(name = "job")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobId;

    @Column(name = "company")
    private String Company;

    @Column(name = "role")
    private String role;

    @Column(name = "salary")
    private Long salary;

    public Job(){

    }

    public Job(Long jobId, String company, String role, Long salary) {
        this.jobId = jobId;
        Company = company;
        this.role = role;
        this.salary = salary;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Job{" +
                "jobId=" + jobId +
                ", Company='" + Company + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
}
