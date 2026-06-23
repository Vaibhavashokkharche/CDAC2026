const express=require('express');
const app=express();
const fs=require('fs');
const PORT=8080;
app.use(express.json());
const file='./product.json';

//get the data
app.get("/",(req, resp)=>{
 fs.readFile(file, "utf8",(err,data)=>{
    resp.send(data);
    resp.end();
 })

})

app.get('/:id',(req, res)=>{
    fs.readFile(file, "utf8",
(err,data)=>{

    var products=JSON.parse(data);
    console.log(data);
    const searchId = parseInt(req.params.id);
    const product = products.find(p => p.prodid === searchId);
    res.send(JSON.stringify(product));
    res.end();
   

})

})

 




app.listen(PORT,()=>{
    console.log("Server Started");
})