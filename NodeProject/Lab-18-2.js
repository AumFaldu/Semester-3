const http = require('http');
const server = http.createServer((req,res)=>{
    if(req.url === "/home"){
        res.end("Home")
    }
    else if(req.url === "/contact"){
        res.end("Contact")
    }
    else if(req.url === "/about"){
        res.end("About");
    }
    else if(req.url === "/docs"){
        res.end("docs");
    }
    else if(res.url === "/news"){
        res.end("News");
    }
});
const port = 2100;
server.listen(port,()=>{
    console.log(`Server is listening to ${port}`);
})