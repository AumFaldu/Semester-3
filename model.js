const mongoose=require('mongoose');
const schema = mongoose.Schema({
    id:Number,
    Name:String,
    Class:String,
    RollNo:Number
});
module.exports = mongoose.model('Students',schema);