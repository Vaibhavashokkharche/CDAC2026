#include <iostream>
using namespace std;
class Demo{
int * ptr;
public:
Demo(){           ///whenever the datamember of class is pointer for that memory allcation takes place at heap section
   ptr= new int();
   *ptr=100;
   
}

void display(){
cout<<*ptr;
    
}
~Demo(){
    cout<<"destructor is called"<<endl;
    delete ptr;
}
};

int main(){
    Demo d1;
    d1.display();
}