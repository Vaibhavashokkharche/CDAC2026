#include<iostream>
using namespace std;
#include<string.h>
class String1
{
  int len;
  char * ptr;
  public:

  void display()
  {
    if(len==1){
    
    cout<<"length is "<<len<<endl;
    cout<<"character is "<<*ptr<<endl;
    }
  else
  {
    cout<<"length is "<<len<<endl;
    cout<<"string is "<<ptr<<endl;
  }
  }
  String1(int l)
  {
    len=l;
    ptr=new char[len+1];
    cout<<"accept string\n";
    cin>>ptr;
  }
  String1(int l,char ch)
  {
    int i;
    len=l;
    ptr=new char[len+1];
    for(i=0;i<len;i++)//len=50
    {
      ptr[i]=ch;
    }//49
    //i=50
    ptr[i]='\0';
  }

};
int main()
{
  String1 c3(4);
  c3.display();
  String1 c4(50,'*');
  c4.display();
}