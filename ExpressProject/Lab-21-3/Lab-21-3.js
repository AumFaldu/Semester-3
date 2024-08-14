const mongoose = require('mongoose');
const express = require('express');
const app = express();
app.use(express.json())
const model = require('./model');
const connectionString  = "mongodb+srv://AumFaldu:Aum@cluster0.0w7pb.mongodb.net/Demo";
mongoose.connect(connectionString).then(()=>{
    console.log('MongoDB Connected');
    //GetAll
    app.get('/',async (req,res)=>{
        const ans = await model.find();
        res.send(ans);
    });
    //Add
    app.post('/add',async (req,res)=>{
        const {id,Name,Class,RollNo} = req.body;        
        const ans = await model.create({...req.body});
        res.send(ans);
    });
    //GetXByParameter
    app.get('/one/:id',async (req,res)=>{
        const data = await model.findOne({id:req.params.id});
        res.send(data);
    })
    //GetXByID
    app.get('/:findId',async (req,res)=>{
        const data = await model.findById(req.params.findId);
        res.send(data);
    })
    //
    const port = 5000;
    app.listen(port,(req,res)=>{
        console.log(`Server is listening at ${port}`);
    })
});