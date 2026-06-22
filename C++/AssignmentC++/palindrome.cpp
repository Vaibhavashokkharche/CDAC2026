#include <iostream>
using namespace std;
int main(){
int num, rev=0, rem, orgnum;
cout<<"Enter the number\n";
cin>>num;
orgnum=num;

while(num!=0){


rem=num%10;
rev=rev*10+rem;
num=num/10;
}
if(orgnum==rev){
    cout<<"its palindromenumber"<<orgnum;
}else{
    cout<<"not palindromenumber"<<orgnum;
}


}