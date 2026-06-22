#include <iostream>
using namespace std;
// when we use the inheritance the follwing points are keep in mind
//1--> 


class A{
int a;
public:
A(){
    cout<<"The no args Construtor is called  of (Class A)\n";

}
A(int a){
    this->a=a;
    cout<<"The Parameterized constructor oof (Class A)\n";
}

int getData(){
    return a;
}
void display(){
    cout<<"The value of a= "<<a;
}

~ A(){
    cout<<"the destructor of a class is called\n";
}

};


class B :public A{
public:
int b;

B(){
    cout<<"The noArgs Constructor of (Class B) is Called\n";

}
B(int b):A(7)  //base class intalization list
{
    cout<<"The Parameterized constructor of (Class B) is Called\n";
    this->b=b;
}




void display(){
    cout<<"the value of b is ="<<b;
}
~ B(){
    cout<<"the destructor of b class is called\n";
}
};



int main(){

B b1(6); //parametrized constructor is called of both  a na b;
b1.display(); //


}