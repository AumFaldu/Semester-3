import { useEffect, useState } from "react";

const Counter = () => {
  let [count, setCount] = useState(0);
  let [action, setAction] = useState(null);
  var check;
  useEffect(() => {
    if (action === "start") {
      var timer = setInterval(() => {
        setCount(count + 1);
      }, 1000);
      check = true;
    } else if (action === "stop") {
      check = false;
    } else if (action === "reset") {
      setCount(0);
    }
    return () => {
      if (check) {
        clearInterval(timer);
      }
    };
  });

  return (
    <>
      <h1>Count = {count}</h1>
      <button
        className="btn btn-outline-success"
        onClick={() => {
          setAction("start");
        }}
      >
        Start
      </button>
      <button
        className="btn btn-outline-danger"
        onClick={() => {
          setAction("stop");
        }}
      >
        Stop
      </button>
      <button
        className="btn btn-outline-warning"
        onClick={() => {
          setAction("reset");
        }}
      >
        Reset
      </button>
    </>
  );
};

export default Counter;
