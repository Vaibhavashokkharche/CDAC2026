const { throws } = require('assert');
const f=require('fs');
// f.writeFileSync("demo.txt", "Vaibhav");
// f.appendFileSync("demo.txt", "kharche");
f.writeFile("sample.txt", "Vaibhav Ashok Kharche", function(err , data){
if(err){
    throws
}
else {
    console.log("File write successfully");
}
})
f.readFile("sample.txt","utf8", (error, data)=>{
   if(error){
    let e=throws;
    console.log(e);
   }else{

    console.log(data);
   }

})