const http = require('http');
const fs = require('fs');
const server = http.createServer((req,res)=>{
    if(req.url === "/about"){
        fs.readFile('About.txt',(err,data)=>{
            res.end(data);
        });
    }
    else if(req.url === "/contact"){
        fs.readFile('Contact.txt',(err,data)=>{
            res.end(data);
        });
    }
});
const port = 2100;
server.listen(port,()=>{
    console.log(`Server is listening to ${port}`);
})