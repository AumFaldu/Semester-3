import React from "react";
const DemoFunction = (props) => {
  let temp = "";
  for (let i = 0; i < props.count; i++) {
    temp += "This is Demo Function";
  }
  return <h1>{temp}</h1>;
};
export default DemoFunction;
