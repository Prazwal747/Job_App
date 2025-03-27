import React, { useEffect, useState } from "react";
import { listJobs } from "../services/JobServices";

function JobBoard() {
  const [jobs, setJobs] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  // Fetch Jobs on Component Mount
  useEffect(() => {
    const fetchJobs = async () => {
      try {
        const response = await listJobs();
        setJobs(response.data);
      } catch (err) {
        setError("Failed to fetch jobs");
      } finally {
        setLoading(false);
      }
    };
    fetchJobs();
  }, []);

  if (loading) return <h3 className="text-center mt-4">Loading jobs...</h3>;
  if (error) return <h3 className="text-center text-danger">{error}</h3>;

  return (
    <div className="container mt-4">
      <h2 className="text-center mb-4">Available Jobs</h2>
      <div className="row">
        {jobs.map((job) => (
          <div className="col-md-4 mb-4" key={job.job_id}>
            <div className="card shadow-sm">
              <div className="card-body">
                <h5 className="card-title">{job.company}</h5>
                <h6 className="card-subtitle mb-2 text-muted">{job.role}</h6>
                <p className="card-text">
                  <strong>Salary:</strong> {job.salary}
                </p>
                <a href="#" className="btn btn-primary">
                  Apply Now
                </a>
              </div>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
}

export default JobBoard;
