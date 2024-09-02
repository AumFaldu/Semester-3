const http = require('http');
const server = http.createServer((req,res)=>{
    res.end("Hello World");
});
const port = 2100;
server.listen(port,()=>{
    console.log(`Server is listening to ${port}`);
})

