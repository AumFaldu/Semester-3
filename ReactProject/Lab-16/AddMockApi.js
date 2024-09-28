import { useState } from "react";
import { useNavigate, Link } from "react-router-dom";

function AddFaculty() {
  const [data, setData] = useState({
    FacultyID: "",
    FacultyName: "",
    FacultyExp: "",
    FacultyImage: "",
  });
  const navigate = useNavigate();

  const handleSubmit = () => {
    const ApiUrl = "https://66eaa9da55ad32cda479e4b7.mockapi.io/Faculty";
    fetch(ApiUrl, {
      method: "POST",
      body: JSON.stringify(data),
      headers: { "Content-Type": "application/json" },
    })
      .then((res) => res.json())
      .then(() => {
        navigate("/Faculty");
      });
  };

  return (
    <>
      <div className="row">
        <div className="col">
          <label>Faculty ID</label>
          <input
            onChange={(e) => setData({ ...data, FacultyID: e.target.value })}
            type="text"
            className="form-control"
            value={data.FacultyID}
          />
        </div>
      </div>

      <div className="row">
        <div className="col">
          <label>Faculty Name</label>
          <input
            onChange={(e) => setData({ ...data, FacultyName: e.target.value })}
            type="text"
            className="form-control"
            value={data.FacultyName}
          />
        </div>
      </div>

      <div className="row">
        <div className="col">
          <label>Faculty Experience</label>
          <input
            onChange={(e) => setData({ ...data, FacultyExp: e.target.value })}
            type="text"
            className="form-control"
            value={data.FacultyExp}
          />
        </div>
      </div>

      <div className="row">
        <div className="col">
          <label>Faculty Image URL</label>
          <input
            onChange={(e) => setData({ ...data, FacultyImage: e.target.value })}
            type="text"
            className="form-control"
            value={data.FacultyImage}
          />
        </div>
      </div>

      <div className="row mt-3">
        <div className="col">
          <button onClick={handleSubmit} className="btn btn-primary">
            Submit
          </button>
        </div>
      </div>

      <div className="row mt-3">
        <div className="col">
          <Link to="/Faculty" className="btn btn-secondary">
            Back
          </Link>
        </div>
      </div>
    </>
  );
}

export default AddFaculty;
