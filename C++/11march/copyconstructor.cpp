#include<iostream>
using namespace std;

class Demo{
int a;

public:
Demo(int x){
cout<<"Constructor is called\n";
a=x;
}
void display(){
cout<<"the value of a is "<<a;

}
Demo(Demo &d1_new){
    this->a=d1_new.a;
    cout<<"copy constructor is called\n";
}

};
int main(){
    Demo d1(10);
    Demo d2(d1);  //for these case copy constructor is called its implicitly added by compiler we no need to add its expilcitly but
    d2.display();  // if the data member of class as pointer so we need to give the copy constructor explicitly to avoid dangling pointer


}