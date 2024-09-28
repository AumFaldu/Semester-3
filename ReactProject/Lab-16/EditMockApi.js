import { useState, useEffect } from "react";
import { useNavigate, useParams, Link } from "react-router-dom";

function EditFaculty() {
  const [data, setData] = useState({
    FacultyID: "",
    FacultyImage: "",
    FacultyExp: "",
    FacultyName: "",
  });
  const { id } = useParams();
  const navigate = useNavigate();

  useEffect(() => {
    const ApiUrl = `https://66eaa9da55ad32cda479e4b7.mockapi.io/Faculty/${id}`;
    fetch(ApiUrl)
      .then((res) => res.json())
      .then((res) => setData(res));
  }, [id]);

  const handleChange = (e) => {
    const { name, value } = e.target;
    setData((prevData) => ({
      ...prevData,
      [name]: value,
    }));
  };

  const handleSave = () => {
    const ApiUrl = `https://66eaa9da55ad32cda479e4b7.mockapi.io/Faculty/${id}`;
    fetch(ApiUrl, {
      method: "PUT",
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
      <div className="container">
        <div className="row">
          <label>FacultyID</label>
          <input
            onChange={handleChange}
            type="text"
            name="FacultyID"
            className="form-control"
            value={data.FacultyID}
          />
        </div>
        <div className="row">
          <label>FacultyName</label>
          <input
            onChange={handleChange}
            type="text"
            name="FacultyName"
            className="form-control"
            value={data.FacultyName}
          />
        </div>
        <div className="row">
          <label>FacultyExp</label>
          <input
            onChange={handleChange}
            type="text"
            name="FacultyExp"
            className="form-control"
            value={data.FacultyExp}
          />
        </div>
        <div className="row">
          <label>FacultyImage</label>
          <input
            onChange={handleChange}
            type="text"
            name="FacultyImage"
            className="form-control"
            value={data.FacultyImage}
          />
        </div>
        <div>
          <button onClick={handleSave} className="btn btn-primary">
            Save
          </button>
          <Link to="/Faculty" className="btn btn-info">
            Back
          </Link>
        </div>
      </div>
    </>
  );
}

export default EditFaculty;
