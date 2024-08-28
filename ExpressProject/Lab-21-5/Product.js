const mongoose=require('mongoose');
const schema = mongoose.Schema({
    id:Number,
    Name:String,
    Brand:String,
});
module.exports = mongoose.model('Product',schema);
