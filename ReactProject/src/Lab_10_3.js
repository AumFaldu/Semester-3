import React from "react";

const Element1 = (props) => {
  return <>{props.isDisplay == "true" && <h1>Element1</h1>}</>;
};

const Element2 = (props) => {
  return <>{props.isDisplay == "true" && <h1>Element2</h1>}</>;
};

const Element3 = (props) => {
  return <>{props.isDisplay == "true" && <h1>Element3</h1>}</>;
};

const Element4 = (props) => {
  return <>{props.isDisplay == "true" && <h1>Element4</h1>}</>;
};

const Element5 = (props) => {
  return <>{props.isDisplay == "true" && <h1>Element5</h1>}</>;
};

export { Element1, Element2, Element3, Element4, Element5 };
