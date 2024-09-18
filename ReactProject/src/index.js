import React from "react";
import { createRoot } from "react-dom/client";
import Counter from "./Lab_13_2";
const rootElement = document.getElementById("root");
const root = createRoot(rootElement);
root.render(
  <>
    <Counter />
  </>
);
