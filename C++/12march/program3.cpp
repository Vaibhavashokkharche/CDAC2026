#include <iostream>
using namespace std;

class Parent{
int pvt_p;
protected:
int prot_p=12;
public:
int pub_p=15;
//Member function
public:
int getPvt(){
    this->pvt_p=10;
}

};
//Mode of inheritance Protected
//Protected member only aceessible in same class and there derived class only
//Whenever the mode of in inheritance is Proctected the access of data member of Parent class within child class as follwing
//Private(Data Memeber)=== Private only no one can access
//Public (Data Member)==Becomes a Protected in child class
//Protected (Data Member) == same as Protected in child class

class Child: protected Parent{
int id_c;
public:
int pub_c;
protected:
int prot_c;


};

int main(){
Child c1;
// Parent class member calling thourgh the child object
c1.prot_p; //Error because the protected accesible only subclass
c1.; //Error Because its private not access outside of the class
c1.getPvt(); //Error it public in parent class but due to mode of protected it becomes protected in chid class
c1.pub_p; //it also not aceesiblebecause it is now protected in child class

         




}


