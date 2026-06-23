// 1) accept command line args in node js 
//    and display addition of even numbers from that 
console.log(process.argv)
function checknumber(){
for(var i=3;i< process.argv.length;i++){
        let  c=parseInt(process.argv[i]);
        console.log(c);


let message = (c%2===0 ? c+"Evennumber":c+ "oddNumber");
console.log(message);
    // if(c%2==0){
    //     console.log(c+ "Even Number");
    // }else{
    //     console.log(c+ "oddnumber");
    // }
}}
checknumber();