import React from "react";

const ArrMap = () => {
  let arr = ["React", "JS"];

  return (
    <ul>
      {arr.map((element) => (
        <li>{element}</li>
      ))}
    </ul>
  );
};

export default ArrMap;
