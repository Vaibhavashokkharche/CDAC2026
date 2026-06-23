
// 3) Write a function calculate to perform addition of numbers  from given string 
//    let d = '12345678as'  in calc.js file 

// and call that calculate function from main.js file 
let a="12f sdrfdsf2d";

let sum=0;
export function calculate(){
for(var i=0;i<a.length;i++){
 if(!isNaN(a[i])&& a[i] !==" "){
    sum+=parseInt(a[i]);

 }
}
console.log(sum);}