#include <iostream>
using namespace std;

int main(){
    int num, sum=0, rem, orgnum;
   
cout<<"Enter the number which check armstrong or not\n";
cin>>num;
 orgnum=num;
while(num!=0){
rem=num%10;
sum=sum+rem*rem*rem;
num=num/10;
}
if(sum==orgnum){
    cout<<"The number is armstrongnumber  "<<orgnum;
}else{
    cout<<"The number is not armstrongnumber"<<orgnum;
}
1


}
