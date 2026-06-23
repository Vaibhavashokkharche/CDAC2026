// by using http module create server and run on port numer  - 5050 

// create api  /
//      /index   --- > display <index page> on browser 
//                   /home --- > display <Home Page> on browser 

//   /aboutus --> display <About US> using post method 

// hint  - use postman for post method 



const p=require('http');

const server2=p.createServer(handleData);
function handleData(request, response){
    console.log(request.method);
 response.write("vaibhav Ashok Kharche");



}

server2.listen(5151, ()=>{
    console.log("server started");
})