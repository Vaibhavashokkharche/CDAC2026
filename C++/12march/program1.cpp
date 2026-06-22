#include <iostream>
using namespace std;
// The aqquiring the properties of Base class into the derived class and in dervied class we add some new function is called as inheritance
// Whenever the object is created the base class constructor is called and memory is allocated for base class only
// and whenever the derived the class is object is created the memory allocated for both class data member
//we can not call the function of base class thourgh the parent class object

class Base{
    public:
    double bonus;

    public :
    Base(){
    cout<<"The Base class constructer is called\n";
       this->bonus=500;
    }
};
class Derived :public Base{
double salary;
public:
Derived(){
    cout<<"The Derived class constructer is called\n";
}
int CurrentMonthSalary(double s){
    this->salary=s;
  return salary+bonus;
}

};

int main(){

Derived d1; //object of dervied class
cout<<"The salary of employee is  "<<d1.CurrentMonthSalary(25)<<endl;

//b1.CurrentMonthSalary(10000); // here is the error because the base class objected not invoked the base class data memeber
 Base b1;
cout<<"the value of bonus is "<<b1.bonus<<endl; //accesible



}