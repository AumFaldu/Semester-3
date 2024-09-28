import React, { useState, useEffect } from "react";
import { Outlet, Link, useParams, useNavigate } from "react-router-dom";

const Faculty = () => {
  const [data, setData] = useState([]);
  const APIurl = "https://66eaa9da55ad32cda479e4b7.mockapi.io/Faculty";

  useEffect(() => {
    fetch(APIurl, { method: "GET" })
      .then((res) => res.json())
      .then((res) => setData(res));
  }, []);

  const formattedFaculty = data.map((Fac) => {
    return (
      <tr key={Fac.FacultyID}>
        <td>{Fac.FacultyID}</td>
        <td>{Fac.FacultyName}</td>
        <td>
          <Link className="btn btn-primary" to={"/Faculty/" + Fac.FacultyID}>
            Read More
          </Link>
        </td>
        <td>
          <Link
            className="btn btn-warning"
            to={"/Faculty/edit/" + Fac.FacultyID}
          >
            Edit
          </Link>
        </td>
      </tr>
    );
  });

  return (
    <>
      <table className="table table-responsive">
        <thead>
          <tr>
            <th>Faculty ID</th>
            <th>Faculty Name</th>
            <th>Details</th>
            <th>Edit</th>
          </tr>
        </thead>
        <tbody>{formattedFaculty}</tbody>
      </table>
      <Link to="/Faculty/add" className="btn btn-primary">
        Add
      </Link>
    </>
  );
};

const Layout = () => {
  return (
    <>
      <div>
        <Outlet />
      </div>
    </>
  );
};

const Home = () => {
  return (
    <>
      <h1>Welcome to my WebApp</h1>
      <Link className="btn btn-primary" to="/Faculty">
        Start
      </Link>
    </>
  );
};

const DetailFaculty = () => {
  const [data, setData] = useState({});
  const { id } = useParams();
  const navigate = useNavigate();
  const apiUrl = `https://66eaa9da55ad32cda479e4b7.mockapi.io/Faculty/${id}`; // corrected URL

  useEffect(() => {
    fetch(apiUrl)
      .then((res) => res.json())
      .then((res) => setData(res));
  }, [apiUrl]);

  return (
    <>
      <Link to="/Faculty" className="btn btn-info">
        Back
      </Link>
      <button
        className="btn btn-danger"
        onClick={() => {
          fetch(apiUrl, { method: "DELETE" }).then(() => {
            navigate("/Faculty");
          });
        }}
      >
        Delete
      </button>
      <h1>ID of the Faculty = {data.FacultyID}</h1>
      <h1>Name of the Faculty = {data.FacultyName}</h1>
      <h1>Experience of the Faculty = {data.FacultyExp}</h1>
      {data.FacultyImage && <img src={data.FacultyImage} alt="Faculty" />}{" "}
    </>
  );
};

export { Home, Layout, Faculty, DetailFaculty };
