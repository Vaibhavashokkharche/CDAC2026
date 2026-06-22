#include <iostream>
using namespace std;
int  main(){
int a , int b ;
cout<<"Enter the value of a and b/n";
cin>>a;
cin>>b;
cout<<"value of a and b Before swapping";
cout<<"value of a = "<<a;
cout<<"value of b = "<<b;

}
void swap(int p, int q){
    int temp=p;
    p=q;
    q=temp;
    cout<<"the value of p ="<<p;
    cout<<"the value of q ="<<q;
    
    }