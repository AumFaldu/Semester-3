import { BrowserRouter, Route, Routes, Outlet, Link } from "react-router-dom";

const Home = () => {
  return (
    <div style={{ textAlign: "center" }}>
      <h1>Home Page</h1>
    </div>
  );
};

const About = () => {
  return (
    <div style={{ textAlign: "center" }}>
      <h1>About Us Page</h1>
    </div>
  );
};

const Contact = () => {
  return (
    <div style={{ textAlign: "center" }}>
      <h1>Contact Us Page</h1>
    </div>
  );
};

const Product = () => {
  return (
    <div style={{ textAlign: "center" }}>
      <h1>Product Page</h1>
    </div>
  );
};

const Services = () => {
  return (
    <div style={{ textAlign: "center" }}>
      <h1>Services Page</h1>
    </div>
  );
};

const Layout = () => {
  return (
    <>
      <div className="container">
        <div className="row">
          <div className="col-2 mx-auto my-auto border border-dark">
            <h1>Logo</h1>
          </div>
          <div className="col border border-primary">
            <div className="navbar-nav d-flex flex-row">
              <Link to="/home" className="nav-item nav-link mx-auto">
                Home
              </Link>
              <Link to="/about" className="nav-item nav-link mx-auto">
                About
              </Link>
              <Link to="/contact" className="nav-item nav-link mx-auto">
                Contact
              </Link>
              <Link to="/product" className="nav-item nav-link mx-auto">
                Product
              </Link>
              <Link to="/services" className="nav-item nav-link mx-auto">
                Services
              </Link>
            </div>
          </div>
        </div>
        <div className="row">
          <div className="col-3 border border-warning">
            <center>
              <h2>Sidebar</h2>
            </center>
          </div>
          <div className="col border border-info">
            <Outlet />
          </div>
        </div>
        <div className="row">
          <div className="col border border-danger">
            <center>
              <h2>Footer</h2>
            </center>
          </div>
        </div>
      </div>
    </>
  );
};

const App = () => {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route path="home" element={<Home />} />
          <Route path="about" element={<About />} />
          <Route path="contact" element={<Contact />} />
          <Route path="product" element={<Product />} />
          <Route path="services" element={<Services />} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
};

export default App;
