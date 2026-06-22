#include <iostream>
#include <string>
using namespace std;
class User
{
public:
   User()
   {

      cout << "the default constructor is called\n";
   }
   User(string fname)
   {
cout<<"the 1 args comnstructor is called:" <<fname<<endl;
   }
   User(string fname, string lastname)
   {
      cout << "The 2 args is Called " << fname << " " << lastname << endl;
   }
   User(string fname, string mname, string lastname)
   {
      cout << "The  3 args is Called " << fname << " " << mname << " " << lastname << endl;
   }
};
int main()
{
   User();
   User("Vaibhav");
   User("vaibhav","Ashok","Kharche");
   User("Komal", "Kharche");
}
