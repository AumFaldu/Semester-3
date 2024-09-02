const express = require('express');
const app = express();
const fs = require('fs');
app.get('/About',(req,res)=>{
    res.setHeader('Content-Type', 'text/plain');
    var about = fs.readFileSync('About.txt');
    res.send(about);
});
app.get('/Contact',(req,res)=>{
res.setHeader('Content-Type', 'text/plain');
   var con =  fs.readFileSync('Contact.txt');
   res.send(con);
});
const port=3200;
app.listen(port,()=>{
    console.log(`Server is listening at ${port}`);
});