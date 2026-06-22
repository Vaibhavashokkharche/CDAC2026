#include <iostream>

using namespace std;

class Test{
    
    int x;
   public:
   Test(){
    cout<<"Constructor is called\n";

   } 

~Test(){
    cout<<"Destrcutor is called\n";
}

};
int main(){
       Test* ptr=new Test();
       delete ptr; //destructor is called

  Test* ptr1 =(Test*)malloc(sizeof(Test));
  free(ptr);
}



