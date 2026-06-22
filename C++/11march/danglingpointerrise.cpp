#include <iostream>
#include <string.h>
using namespace std;
class Demo{
int len;
char *ptr;

public:
void display(){
cout<<"the length is "<<len<<endl;
cout<<"the character is "<<ptr<<endl;
}
Demo(){

}
Demo(char * sptr){
  len=strlen(sptr);
    ptr=new char[len+1];\
    strcpy(ptr, sptr);
}
~Demo(){
    cout<<"the destructor is called\n";
    delete []ptr;
}

};
int main(){

Demo d1("Vaibhav");
d1.display();
{
Demo d2(d1);//copy constructor
d2.display();
}
d1.display(); // dangling pointer condition arise
}