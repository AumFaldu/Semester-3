import React from "react";
const Faculties = () => {
  let Faculty = [
    {
      id: "1",
      Name: "Arjun",
      Surname: "Bala",
      Subject: "WT",
    },
    {
      id: "2",
      Name: "Shruti",
      Surname: "Maniar",
      Subject: "DS",
    },
    {
      id: "3",
      Name: "Dixita",
      Surname: "Kagathara",
      Subject: "DBMS",
    },
  ];
  return (
    <div className="table-responsive">
      <table className="table border border-1">
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Surname</th>
            <th>Subject</th>
          </tr>
        </thead>
        <tbody>
          {Faculty.map((obj) => (
            <tr>
              <td>{obj.id}</td>
              <td>{obj.Name}</td>
              <td>{obj.Surname}</td>
              <td>{obj.Subject}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};
export default Faculties;
