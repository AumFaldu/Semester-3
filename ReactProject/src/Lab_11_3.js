import React from "react";
const Students = () => {
  let Student = [
    {
      id: "1",
      Name: "Aum",
      Surname: "Faldu",
      RollNo: "106",
    },
    {
      id: "2",
      Name: "Nisarg",
      Surname: "Lo",
      RollNo: "113",
    },
    {
      id: "3",
      Name: "Pujan",
      Surname: "Ajmera",
      RollNo: "119",
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
            <th>RollNo</th>
          </tr>
        </thead>
        <tbody>
          {Student.map((obj) => (
            <tr>
              <td>{obj.id}</td>
              <td>{obj.Name}</td>
              <td>{obj.Surname}</td>
              <td>{obj.RollNo}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};
export default Students;
