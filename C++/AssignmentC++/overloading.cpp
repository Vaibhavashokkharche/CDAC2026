#include <iostream>
using namespace std;
int area(int, int);
int area(int );
int main()
{

area(2,4);
area(4);


}
int area(int l,int b){

  cout<<l*b<<endl;
   return l*b;
}
int area(int s){
    cout<<s*s<<endl;
  return s*s;
}