const mongoose = require('mongoose');
const express = require('express');
const app = express();
app.use(express.json())
const model = require('./model');
mongoose.connect('mongodb+srv://AumFaldu:Aum@cluster0.0w7pb.mongodb.net/').then(()=>{
    console.log('MongoDB Connected');
    //GetAll
    app.get('/',async (req,res)=>{
        const ans = await model.find();
        res.send(ans);
    });
    //Add
    app.post('/add',async (req,res)=>{
        const {id,Name,Class,RollNo} = req.body;        
        const ans = await model.create({id,Name,Class,RollNo});
        res.send(ans);
    });
    //GetXByParameter
    app.get('/:id',async (req,res)=>{
        const data = await model.find({id:req.params.id});
        res.send(data);
    })
    //GetXByID
    app.get('/one/:findId',async (req,res)=>{
        const data = await model.findOne({_id:req.params.findId});
        res.send(data);
    })
    const port = 5000;
    app.listen(port,(req,res)=>{
        console.log(`Server is listening at ${port}`);
    })
});