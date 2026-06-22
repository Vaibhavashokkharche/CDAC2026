#include <iostream>
using namespace std;
class Employee
{
    int id;

public:
    Employee()
    {
        cout << "The default constructor of Employee class is called\n";
    }
    Employee(int i)
    {
        cout << "The parameter constructer is called\n";
        this->id = i;
    }
    void display()
    {
        cout << "The value of id= " << id;
    }
    int findSalary()
    {

        return 0;
    }
};
class WageEmployee : public Employee
{

    int hrs, rate;

public:
    WageEmployee()
    {
        cout << "The default constructor WageEmployee is called\n";
    }
    WageEmployee(int i, int h, int r) : Employee(i)
    {
        cout << "The para constructor of WageEmployee is called\n";
        this->hrs = h;
        this->rate = r;
    }
    void display()
    {
        Employee ::display();
        cout << "The value of hrs and rates is" << " " << hrs << " " << rate;
    }
    int findSalary()
    {

        return (hrs * rate);
    }
};
class SalesPerson : public WageEmployee
{
    int sales;
    int cm;
    public:
SalesPerson(){
  cout << "The default constructor of SP class is called\n";
    
}     
    SalesPerson(int i , int h, int r , int s, int c) : WageEmployee(i, h, r){
        cout<<"The para constructor of salesperson is called\n";
        this->sales=s;
        this->cm=c;
    }
    void display(){
      
        WageEmployee::display();
        cout<<"the sales and commission is"<<sales<<" "<<cm<<endl;
    }

    int findSalary(){
        return WageEmployee::findSalary() +sales*cm;
    }
    
};

int main()
{
 SalesPerson se1(201,5,25,500,5);
   se1.display();
   cout<<se1.findSalary();
};
