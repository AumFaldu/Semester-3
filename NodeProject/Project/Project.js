const http = require('http');
const fs = require('fs');
const url = require('url');
const server = http.createServer((req, res) => {
    res.setHeader('Content-Type', 'text/html');
    res.write('<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">');
    res.write(`
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Navbar</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link" href="/home">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/contact">Contact</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/about">About</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/products">Products</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/services">Services</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    `);

    res.write('<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>');

    let filePath;
    switch (req.url) {
        case "/home":
            filePath = 'Home.html';
            break;
        case "/contact":
            filePath = 'Contact.html';
            break;
        case "/about":
            filePath = 'About.html';
            break;
        case "/products":
            filePath = 'Products.html';
            break;
        case "/services":
            filePath = 'Services.html';
            break;
        default:
            filePath = null;
    }

    if (filePath) {
        fs.readFile(filePath, (err, data) => {
            if (err) {
                res.statusCode = 500;
                res.write("<h1>Internal Server Error</h1>");
            } else {
                res.write(data);
            }
            res.end();
        });
    } else {
        res.statusCode = 404;
        res.write("<h1>404 Not Found</h1>");
        res.end();
    }
});

const port = 2200;
server.listen(port, () => {
    console.log(`Server is listening on ${port}`);
});
