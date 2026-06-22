#include <iostream>
using namespace std;
class String1{
int len;
char * ptr;
public:
String1(int l, char ){
    len=1;
   char* ptr=new char['A'];
   
}
void display(){
    cout<<"the length is "<<len<<endl;
    cout<<"the character is "<<ptr<<endl;
}

};
int main(){

String1 s1;

s1.display();
}