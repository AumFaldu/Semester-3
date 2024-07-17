const fs = require("fs");
fs.exists('/NodeProject/Lab-17-3.js',(exists)=>{
	console.log(exists ? 'Found':'Not Found');
})
fs.stat('index.js',(err,data)=>{
	console.log(data);
})
