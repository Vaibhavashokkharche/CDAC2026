let p1=require('http');
const server1=p1.createServer(checkserver);

function checkserver(req,res){
    res.write("Vaibhav Ashok Kharche i am oreiginally from buldhana");
    res.end();
    
}
server1.listen(8080);