const http = require('http');
const fs = require('fs');
var url = require('url');
const server = http.createServer((req,res)=>{
    res.setHeader('Content-Type','text/html');
    res.write("<div>");
    res.write("<a href='home'>Home</a>");
    res.write("<a href='contact'>Contact</a>");
    res.write("<a href='about'>About</a>");
    res.write("<a href='products'>Products</a>");
    res.write("<a href='services'>Services</a>");
    res.write("</div>");
    if(req.url == "/home"){
      res.write(fs.readFileSync('Home.html'));
    }
    else if(req.url == "/contact"){
        res.write(fs.readFileSync('Contact.html'));
    }
    else if(req.url == "/about"){
        res.write(fs.readFileSync('About.html'));
    }
    else if(req.url == "/products"){
        res.write(fs.readFileSync('Products.html'));
    }
    else if(req.url == "/services"){
        res.write(fs.readFileSync('Services.html'));
    }
    res.end();
});
const port = 2200;
server.listen(port,()=>{
    console.log(`Server is listening on ${port}`); 
});