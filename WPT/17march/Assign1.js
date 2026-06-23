//a number is perfect number if it is equal to the sum of proper divisor that is sum of its positive divisor excluding the
//excluding the number itself find the postive int perfect or not
// for eg 6 =1+2+3=6


function CheckPerfectNumber(num){
    let sum=0;
    for (var i=1;i<num;i++){
      if(num%i==0){
       sum=sum+i;
      }}
      if(sum==num){
        console.log("PerfectNumber");

      
    }else{

        console.log("Not perfect Number");

      }
    
}

CheckPerfectNumber(12);