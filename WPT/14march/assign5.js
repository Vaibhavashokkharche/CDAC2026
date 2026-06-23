// create file sample.txt add some data in that file 
//    and read that file in synchronus way as well as asynchronus const 
const { throws } = require('assert');
const { isUtf8 } = require('buffer');
const f=require('fs');
f.writeFile('demo.text',"Vaibhav Ashok kharche Rushikesh Ashok kharche Nilima Ashok Kharche Shraddha Rushikesh Kharche", (err, resolved)=>{
    if(err){
        throws
    }else
    console.log("File write suceesfully")

});
f.readFile('demo.text',"utf8", (err ,res)=>{
    if(err){
        throws
    }else{
        console.log(res);
    }


})
let data="Shubham Rajendra Kharche";
f.appendFile('dmo.text', data,(e,r)=>{
 if(e){
    console.log(throws);
 }else{

 }
})