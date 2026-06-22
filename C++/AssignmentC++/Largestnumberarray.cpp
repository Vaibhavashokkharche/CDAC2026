#include <iostream>
using namespace std;
int main(){
int i,n,j; int sum=0;
cout<<"Enter the number of elements in Array";
cin>>n;
int a[n];
for(int i=0;i<n;i++){
cin>>a[i];
}
int max=a[0];
for(j=0;j<n;j++){
if(a[j]>max){
    max=a[j];
}
