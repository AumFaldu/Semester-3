const mongoose=require('mongoose');
const schema = mongoose.Schema({
    id:Number,
    Name:String,
    Subject:String,
});
module.exports = mongoose.model('Faculty',schema);
