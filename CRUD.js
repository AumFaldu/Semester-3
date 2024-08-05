const express = require('express');
const fs = require('fs');
const app = express();
app.use(express.json());
let list = []
//Add
app.post('/list',(req,res)=>{
    const name = req.body;
    list.push(name.roll);
    res.send(list);
})
//Display
app.get('/list',(req,res)=>{
    res.send(list);
});
//Update
app.put('/list/:index',(req,res)=>{
    const id = req.params.index;
    const name = req.body;
    console.log(name);
    list[id] = name.name;
    res.send(list);
});

//Delete
app.delete('/list/:index',(req,res)=>{
    const id = req.params.index;
    list.splice(id,1);
    res.send(list);
});
const port = 3000;
app.listen(port,(req,res)=>{
    console.log(`Server is listening at ${port}`);
})