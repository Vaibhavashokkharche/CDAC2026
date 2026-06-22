#include <iostream>
using namespace std;
class Employee{
int id, salary;
public:
Employee(){  //these is the noargs constructor its intailize the value to class attribuate;
id=101;
salary=30000;
}
void display()const{    //This is constant function 
    cout<<"The id of employee is  "<<id<<endl;
    cout<<"The salary of employee is "<<salary<<endl;    
}

void setId(int i) const{
    id=i;
}
void setSalary(int s){
    salary=s;
}
int getSalary(){
    return salary;
}

};



int main(){
Employee e1;

cout<<"the size of e1 object is"<<sizeof(e1)<<endl;
// e1.display(); // This is non constat object is invoked constant as well as non constant function
// e1.setId(102);
// e1.setSalary(25000);
// e1.display();
//using const object
const Employee e2; // these is constant object constant object only inovoked the const function. b
e2.display();      //Constant object not invoked the function were value is set to an attribuate(Setter Function

e2.setId(103);


}