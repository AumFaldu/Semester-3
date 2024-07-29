const express = require('express');
const app = express();
app.get('/home',(req,res)=>{
    res.send("Home");
});
app.get('/about',(req,res)=>{
    res.send("About");
});
app.get('/contact',(req,res)=>{
    res.send("Contact");
});
app.get('/service',(req,res)=>{
    res.send("Services");
});
app.get('/products',(req,res)=>{
    res.send("Products");
});
const port = 3100;
app.listen(port,()=>{
    console.log(`Server is listening ${port}`);
});