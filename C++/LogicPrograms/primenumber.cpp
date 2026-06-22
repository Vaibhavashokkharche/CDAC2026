#include <iostream>
using namespace std;

int main(){
    int num,i,count=0;
   cout<<"Enter the number for checking the primenumber\n";
   cin>>num;
   for(i=1;i<=num;i++){
   if(num%i==0){
   count++;
   }
}
 if(count==2){
    cout<<"It is primenumber "<<num;
   }else{
   cout<<"its not prime number"<<num;
   }
   }