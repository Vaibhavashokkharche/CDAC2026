#include<iostream>
using namespace std;

class A{
double radius;  //private data member not aceesible outside of the class
                 // if you want to acess the private data member outside of the class then we need to declare the function for him
                //As per the access specifier the scope of function is decided
public:
int CalculateCrircleArea(double r){
this->radius=r;
    return 3.14*radius*radius;
}
};
class B :public A{



};
int main(){
B b1;  // this is B class object
cout<<"The area of circle is "<<b1.CalculateCrircleArea(25); 
// the Calculate area is memmber function of A class but due to inheritance between both class we call the function of A class also with B class object
// But we can not call the dervied class function thourgh the base class object
}