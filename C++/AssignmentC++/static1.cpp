#include <iostream>
using namespace std;
class item{
public:
static int x;
int number;
  
  public:
  void getData(int a){
number =a;
number++;
  }
  void getCount(){

    x=10;
    cout<<"the value of x is "<<x<<endl;
  }
  void getCount1(){

    x++;
    cout<<"the value of number is"<<number<<endl;
    cout<<"the value of x is "<<x<<endl;
  }
};

int number=9;
int item::x;

int main(){
item a;
a.getCount();
a.getData(100);
a.getCount1();
cout<<number<<endl;
cout<<a.number;

}
   