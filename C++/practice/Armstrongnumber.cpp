#include <iostream>
using namespace std;
void ArmstrongNumber(int num){
    int sum=0, rem, orgnum;
    orgnum=num;
    while(num!=0){
        rem=num%10;
        sum=sum+rem*rem*rem;
        num=num/10;
    }
   if(sum==orgnum){
    cout<<"Armstrongnumber"<<orgnum;
   }else{

    cout<<"Not ArmstrongNumber"<<orgnum;
   }

   }


int main(){


    ArmstrongNumber(153);
}


