import React from "react";
const Event = () => {
  return (
    <button
      onClick={() => {
        return alert("Event Called");
      }}
    >
      Click Me
    </button>
  );
};
export default Event;
