const fs = require("fs");
fs.exists('Lab-17-3.js',(exists)=>{
	console.log(exists ? 'Found':'Not Found');
});
fs.stat('Lab-17-3.js',(err,data)=>{
	console.log(data);
});
fs.readFile('Lab-17-3.js',(err,data)=>{
    console.log(data.toString());
});
fs.writeFile('NewFile.txt','Enter anything you want to add',(err)=>{
});
fs.appendFile('NewFile.txt','Enter anything you want to edit',(err)=>{

});
fs.rename('NewFile.txt','newFile.txt',(err)=>{

});
fs.unlink('newFile.txt',(err)=>{

});


