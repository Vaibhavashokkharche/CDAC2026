#include <iostream>
using namespace std;

class Employee{
int id;

public :
Employee(){
 cout<<"The default constrcutor of employee class is called\n";
}
Employee(int i){

    this->id=i;
}
display(){
    cout<<"the id of employee is"<<id<<endl;
}
computesalary(){
    return 0;
}


};
 class WageEmployee :public Employee{
  int hrs;
  int rate;

public:
  WageEmployee(){
    cout<<"The deafult constructor of wedge class employee is called\n";

  }
  WageEmployee(int i ,int h , int r):Employee(i)
  {

    this->hrs=h;
    this->rate=r;
  }
 display(){
    Employee::display();
    cout<<hrs<<" "<<rate;
 }
int computesalary(){
   return rate*hrs;
}
 };

class SalePerson :public WageEmployee{
int comm;
int sales;
public :
SalePerson(){
cout<<"the default constructor salesperson is called\n";
}
SalePerson(int c, int s):WageEmployee() 
{

    this->comm=c;
    this->sales=s;
}

void display(){
   cout<<"the value of commission is ="<<comm;
    cout<<"the value of sales is ="<<sales;
}




};



int main(){
WageEmployee e1(101, 5, 25);
e1.display();




}
