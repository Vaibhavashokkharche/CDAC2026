let pr= new Promise(
   function (fullfilled, rejected){
     let c=5;
     if(c%2==0){
      fullfilled("Even number");}
      else{
      rejected("Odd number");
     }
   }
)
pr.then((m)=>{
console.log(m);

})
.catch((e)=>{

    console.log(e);
});