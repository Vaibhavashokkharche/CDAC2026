#include <iostream>
using namespace std;
int main(){
    int rem, num, orgnum,sum, i;

    for(i=1;i<=999;i++){
         sum=0;
         orgnum=i;
         num=i;
         while(num!=0){
        rem=num%10;
        sum=sum+rem*rem*rem;
        num=num/10;
         }
         if(orgnum==sum){
            cout<<"  "<<orgnum;
         }

    }
};