// 1) write a function addition  , multiplication 
//                               division , subtraction which accepted 2 parameters   
// 	write result function which accept 3 parameters 
     
//                result (a1 , a2 , callback)

// pass callback parameters while calling 

function result(a,b,callback){

    return callback(a,b,callback);
}


function add(a ,b){

    return "the addition is " + (a+b);
}
function sub(a ,b){

    return "the Subsstraction is " + (a-b);
    
}
function multi(a ,b){

    return "the Subsstraction is " +(a*b);
    
}
function div(a ,b, callback){

    return "the Subsstraction is "+ (a/b);
    
}
function Calculate(){
let a=document.getElementById("i1").value;
let b=document.getElementById("i2").value;
let c=document.getElementById("o1").value;


result(a,b, c)
console.log(result(10,20,add))
}












   