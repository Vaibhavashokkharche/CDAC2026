#include <iostream>
using namespace std ;
void Palindromenumber(int num){
    int orgnum, rev, sum=0;
    orgnum=num;
    while(num!=0){
      rev=num%10;
      sum=sum*10+rev;
      num=num/10;
    }
    if(sum==orgnum){
        cout<<"Palindrome Number"<<endl;

    }else {
        cout<<"Not PalindromeNumber"<<endl;
    }
    



}
int main(){


Palindromenumber(321);
}