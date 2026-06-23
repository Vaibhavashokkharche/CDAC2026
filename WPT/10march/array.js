let d =[10,90,80,70,60,55,66,44,88,67];
//for even number
let c =[]; //for even Number
let b=[]; //For odd number
if(c=d.filter((num)=> num%2==0)){
console.log("Even number are " +c);
}else{
console.log("Odd number is "+b);
}
//sorted array
d.sort((n1,n2)=> (n1-n2))
console.log("Sorted array is "+d);
//