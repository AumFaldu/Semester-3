const mongoose = require('mongoose');
const express = require('express');
const app = express();
app.use(express.json())
require('dotenv').config();
const Student = require('./Student');
const connectionString  = "mongodb+srv://"+process.env.DB_UserName+":"+process.env.DB_Password+"@cluster0.0w7pb.mongodb.net/Demo";
mongoose.connect(connectionString).then(()=>{
    console.log('MongoDB Connected');
    //GetAll
    app.get('/',async (req,res)=>{
        const ans = await Student.find();
        res.send(ans);
    });
    //Add
    app.post('/add',async (req,res)=>{
        const {id,Name,Class,RollNo} = req.body;        
        const ans = await Student.create({...req.body});
        res.send('Added Successfully');
    });
    //GetXByParameter
    app.get('/one/:id',async (req,res)=>{
        const data = await Student.findOne({id:req.params.id});
        res.send(data);
    })
    //GetXByID
    app.get('/:findId',async (req,res)=>{
        const data = await Student.findById(req.params.findId);
        res.send(data);
    })
    //Update
    app.patch('/:id',async (req,res)=>{
        await Student.findOneAndUpdate({ id: req.params.id }, req.body, { new: true });
        res.send('Updated Successfully');
    });
    //Delete
    app.delete('/:id',async (req,res)=>{
        await Student.deleteOne({id:req.params.id});
        res.send('Deleted Successfully')
    });
    //Search
    app.get('/search/:s',async (req,res)=>{
        const ans = await Student.find({
            Name:{
                $regex : req.params.s
            }
        })
        res.send(ans);
        })
    app.listen(process.env.PORT,(req,res)=>{
        console.log(`Server is listening at ${process.env.PORT}`);
    })
});
