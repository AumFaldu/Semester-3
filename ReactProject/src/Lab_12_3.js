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
const Blog = () => {
  return (
    <div style={{ textAlign: "center" }}>
      <h1>Blog Page</h1>
    </div>
  );
};
const Testimonials = () => {
  return (
    <div style={{ textAlign: "center" }}>
      <h1>Testimonials Page</h1>
    </div>
  );
};
const Careers = () => {
  return (
    <div style={{ textAlign: "center" }}>
      <h1>Careers Page</h1>
    </div>
  );
};
const FAQ = () => {
  return (
    <div style={{ textAlign: "center" }}>
      <h1>FAQ Page</h1>
    </div>
  );
};
const Terms = () => {
  return (
    <div style={{ textAlign: "center" }}>
      <h1>Terms Page</h1>
    </div>
  );
};
const Privacy = () => {
  return (
    <div style={{ textAlign: "center" }}>
      <h1>Privacy Page</h1>
    </div>
  );
};
const Gallery = () => {
  return (
    <div style={{ textAlign: "center" }}>
      <h1>Gallery Page</h1>
    </div>
  );
};
const Support = () => {
  return (
    <div style={{ textAlign: "center" }}>
      <h1>Support Page</h1>
    </div>
  );
};
const News = () => {
  return (
    <div style={{ textAlign: "center" }}>
      <h1>News Page</h1>
    </div>
  );
};
const Pricing = () => {
  return (
    <div style={{ textAlign: "center" }}>
      <h1>Pricing Page</h1>
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
            <div className="list-group">
              <Link
                to="/Blog"
                className="list-group-item list-group-item-action"
              >
                Blog
              </Link>
              <Link
                to="/Careers"
                className="list-group-item list-group-item-action"
              >
                Careers
              </Link>
              <Link
                to="/FAQ"
                className="list-group-item list-group-item-action"
              >
                FAQ
              </Link>
              <Link
                to="/Terms"
                className="list-group-item list-group-item-action"
              >
                Terms
              </Link>
              <Link
                to="/Privacy"
                className="list-group-item list-group-item-action"
              >
                Privacy
              </Link>
              <Link
                to="/Gallery"
                className="list-group-item list-group-item-action"
              >
                Gallery
              </Link>
              <Link
                to="/Testimonials"
                className="list-group-item list-group-item-action"
              >
                Testimonials
              </Link>
              <Link
                to="/Support"
                className="list-group-item list-group-item-action"
              >
                Support
              </Link>
              <Link
                to="/News"
                className="list-group-item list-group-item-action"
              >
                News
              </Link>
              <Link
                to="/Pricing"
                className="list-group-item list-group-item-action"
              >
                Pricing
              </Link>
            </div>
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
          <Route path="blog" element={<Blog />} />
          <Route path="pricing" element={<Pricing />} />
          <Route path="news" element={<News />} />
          <Route path="support" element={<Support />} />
          <Route path="testimonials" element={<Testimonials />} />
          <Route path="gallery" element={<Gallery />} />
          <Route path="privacy" element={<Privacy />} />
          <Route path="terms" element={<Terms />} />
          <Route path="FAQ" element={<FAQ />} />
          <Route path="careers" element={<Careers />} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
};

export default App;
