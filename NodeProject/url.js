const url = require("url");
const adr = 'https://www.darshan.ac.in/abcd.js?Name=Aum&SurName=Faldu';
const q = url.parse(adr,true);
console.log(q.host);
console.log(q.pathname);
console.log(q.search);
var qdata = q.query;
console.log(qdata);
