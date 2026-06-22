#include<iostream>
using namespace std;
int main(){
    int num, rem, rev=0, orgnum, count =0;
cout<<"Enter the number\n";
cin>>num;
orgnum=num;
while(num!=0){
rem=num%10;
rev=rev*10+rem;
num=num/10;
count++;
}
cout<<"The reverse number is "<<rev<<endl;
cout<<"the total number is "<<count;




}
