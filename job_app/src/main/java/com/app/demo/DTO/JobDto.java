package com.app.demo.DTO;

public class JobDto {

    private Long jobId;
    private String company;
    private String role;
    private Long salary;

    public JobDto() {
    }

    public JobDto(Long jobId, String company, String role, Long salary) {
        this.jobId = jobId;
        this.company = company;
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
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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
                "JobId=" + jobId +
                ", company='" + company + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
}
