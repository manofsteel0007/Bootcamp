/*const log=require("./logger");

log.log("welcome");

const path=require("path");
const os= require("os");
const fs=require('fs');
var answer='';
var i;
fs.readdir('./',function(err,ans){
    if(err) console.log(`error ${err}`);
    else
    {
        answer=ans;
        console.log(`answer :${ans}`);
    }
});
for(i=0;i<answer.length;i++)
    console.log(answer[i]);

console.log();
console.log(`1. ${os.freemem()} \n2. ${os.totalmem()}`);
console.log(path.resolve(__filename));

for(i=0;i<answer.length;i++)
    console.log(answer[i]);
    */

const EventEmitter=require('events');
const emitter=new EventEmitter();