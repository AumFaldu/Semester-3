const express = require('express');
const app = express();
app.use(express.json());
const port = 3000;
let list = [];
//getAll
app.get('/list',(req,res)=>{
    res.send(list);
});
//getXByIndex
app.get('/list/:index',(req,res)=>{
    res.send(list[req.params.index]);
})
//Add
app.post('/list',(req,res)=>{
    const {List} = req.body
    list.push(List);
    res.send('List Added');
})
//Update
app.put('/list/:index',(req,res)=>{
    const {List} = req.body;
    list[req.params.index] = List;
    res.send('List Updated');
});
//Delete
app.delete('/list/:index',(req,res)=>{
    list.splice(req.params.index,1);
    res.send('List Deleted');
})
//SEARCH
app.get('/list/Search/:value',(req,res)=>{
    const value = req.params.value;
    const ans = list.filter(li=>li.includes(value));
    res.send(ans);
});
app.listen(port,(req,res)=>{
    console.log(`Server is listening at ${port}`);
})
