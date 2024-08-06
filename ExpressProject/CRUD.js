const express = require('express');
const app = express();
app.use(express.urlencoded());
let list = [];
//Add
app.post('/list',(req,res)=>{
    list.push(req.body);
    res.send('List Added');
})
//GetAll
app.get('/list',(req,res)=>{
    res.send(list);
});
//GetXById
app.get('/list/:id',(req,res)=>{
    const ans = list.find(li=>li.id==req.params.id);
    res.send(ans);
})
//Update
app.put('/list/:id',(req,res)=>{
    const index = list.findIndex(li=>li.id==req.params.id);
    list[index] = req.body;
    res.send('List Updated');
});

//Delete
app.delete('/list/:id',(req,res)=>{
    const index = list.findIndex(li=>li.id==req.params.id);
    list.splice(id,1);
    res.send('List Deleted');
});
const port = 3000;
app.listen(port,(req,res)=>{
    console.log(`Server is listening at ${port}`);
})
