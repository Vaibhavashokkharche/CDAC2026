let a ="123fdd";
let sum=0;

for (var i=0;i<a.length;i++){
    let char=a[i];
   if(!isNaN(char) && char !==" "){
    // console.log(char);
    sum+=parseInt(char);

   }



}
console.log(sum);