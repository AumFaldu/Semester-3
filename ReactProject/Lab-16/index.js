import React from "react";
import { createRoot } from "react-dom/client";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import { Home, Layout, Faculty, DetailFaculty } from "./Lab_16_2";
import AddFaculty from "./AddMockApi";
import EditFaculty from "./EditMockApi";
const rootElement = document.getElementById("root");
const root = createRoot(rootElement);

root.render(
  <>
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route index element={<Home />} />
          <Route path="/Faculty" element={<Faculty />} />
          <Route path="/Faculty/:id" element={<DetailFaculty />} />
          <Route path="/Faculty/add" element={<AddFaculty />} />
          <Route path="/Faculty/edit/:id" element={<EditFaculty />} />
        </Route>
      </Routes>
    </BrowserRouter>
  </>
);
