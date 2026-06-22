#include <iostream>
using namespace std;
class Complex
{
int real, img;
public:
void accept(){
cout<<"accept the value of real and img number\n";
cin>>real>>img;
}
void display(){
cout<<"The complex number is"<<real<<"+"<<img<<"i"<<endl;
}
int Setreal(int r){
 real=r;
}
};

int main(){
Complex c1;
c1.accept();
c1.display();
c1.Setreal(4);
c1.display();

}