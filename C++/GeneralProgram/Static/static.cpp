#include <iostream>
using namespace std;
class temp{
int z;
static int y; // its a static varible its one copy of stoarge 
public:
// constructor
temp();     // in this case we added the function in the class and define it outside of the calss
             // These is 2nd approch to decelaring the function 
void show();
void display();
};
int x;   //this is global variable in C++ global varible mention outside of the class and function
 // These is static varible here allcoation of memory takes place.
        int temp::y;  //format it like return type classname::variblename or functionname


void temp::show(){
y++;
}
temp::temp(){
    int z=200; x=100;
    cout<<"the value of z is "<<z<<endl;
}
void temp::display(){
cout<<"value of x is  "<<x<<endl;
cout<<"value of y is  "<<y<<endl;
}
 int main(){

    temp t;
    t.show();
    t.show();
    t.display();
    cout<<"the size of t is"<<sizeof(t)<<endl;

 }