#include <iostream>
#include<string.h>
using namespace std;
//in these case dangling pointer conditon is not arise
class String1{
int len;
char *ptr;
public:
String1(char* sptr){
        len=strlen(sptr);
       ptr=new char[len+1];
  strcpy(ptr,sptr);
                             
}
void display(){
    cout<<"the length is "<<len<<endl;
    cout<<"the character  is "<<ptr<<endl;

}


};
int main(){
String1 s1("rohit");
s1.display();
{
String1 s2(s1);//copy constructor
s1.display();
}
s1.display();



}


