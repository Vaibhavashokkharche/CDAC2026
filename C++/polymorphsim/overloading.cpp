#include <iostream>
using namespace std;
 class Addition{
//     public:
// int a ;int b;
 public:
 Addition(){
    cout<<"The default constructor is called\n";
 }
 void add(int a, int b){
    cout<<"The addition of two integer is = "<<a+b<<endl;
 
 }
  void add(int a, double b){
    cout<<"The addition of 1 int and 1double is = "<<a+b<<endl;
 
 }
  void add(int a, float b){
    cout<<"The addition of one int and 1float is = "<<a+b<<endl;
 
 }
  void add(double a, double b){
    cout<<"The addition of two double is = "<<a+b<<endl;
 
 }
 void add(char a, char b){

    cout<<"The addition of two char as per assciis ="<<a+b<<endl;
 }
 };
  
int main(){
// function oveloading is the poerful feature same method and different agruments there
//As the types of agruments complier decides which function need to be called
    Addition a1;
    a1.add(2,4); // add of two integer
    a1.add(2,32.05); //add 1 int and 1 double
    a1.add(2.5, 2.5); //add two double
    a1.add(5, 2.112f); // add int and float
    a1.add('a','b'); // add of two char as per ascci
    return 0;
};