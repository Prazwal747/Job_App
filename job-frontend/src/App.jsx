import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "./App.css";
import JobBoard from "./components/JobBoard";
import Header from "./components/Header";

function App() {
  return (
    <div>
      <Header />
      <JobBoard />
    </div>
  );
}

export default App;
