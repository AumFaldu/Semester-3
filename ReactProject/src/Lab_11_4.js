import React from "react";
const Products = () => {
  let Product = [
    {
      id: "1",
      Name: "Laptop",
      Price: "$1000",
      Warranty: "3 years",
    },
    {
      id: "2",
      Name: "Mobile",
      Price: "$500",
      Warranty: "4 years",
    },
    {
      id: "3",
      Name: "Earphone",
      Price: "$100",
      Warranty: "5 years",
    },
  ];
  return (
    <div className="table-responsive">
      <table className="table border border-1">
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Warranty</th>
          </tr>
        </thead>
        <tbody>
          {Product.map((obj) => (
            <tr>
              <td>{obj.id}</td>
              <td>{obj.Name}</td>
              <td>{obj.Price}</td>
              <td>{obj.Warranty}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};
export default Products;
