import axios from "axios";

const REST_API_BASE_URL = "http://localhost:8985/api/v0.1/job";

export const listJobs = async () => {
  try {
    return await axios.get(REST_API_BASE_URL + "/getAllJobs");
  } catch (error) {
    console.error("Error fetching jobs:", error);
    throw error;
  }
};

export const saveJob = async (job) => {
  try {
    return await axios.post(`${REST_API_BASE_URL}/create`, job);
  } catch (error) {
    console.error("Error saving job:", error);
    throw error;
  }
};

export const getJob = (jobId) => {
  try {
    return axios.get(`${REST_API_BASE_URL}/getJob/${jobId}`);
  } catch (error) {
    console.error(`Error fetching job with ID ${jobId}:`, error);
    throw error;
  }
};

export const deleteJob = async (jobId) => {
  try {
    return await axios.delete(`${REST_API_BASE_URL}/${jobId}`);
  } catch (error) {
    console.error(`Error deleting job with ID ${jobId}:`, error);
    throw error;
  }
};

export const updateJob = async (job) => {
  try {
    return await axios.put(`${REST_API_BASE_URL}/updateJob`, job);
  } catch (error) {
    console.error("Error updating job:", error);
    throw error;
  }
};
