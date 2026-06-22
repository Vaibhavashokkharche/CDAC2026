#include <iostream>
#include <String>
using namespace std;

class Payment{
public:

void makepayment(string cardnumber, string expiry, int cvv){

cout<<"The card method is called"<<cardnumber<<"||"<<expiry<<"||"<<cvv<<endl;

}
void makepayment(string upi){

cout<<"The upi method is called"<<upi<<endl;


}
void makepayment(){
cout<<"Congrats Your order is placed please pay at the time of deliver"<<endl;

}
};
int main(){
Payment p1;
p1.makepayment("7218964006","02/35", 704); // cardpayment is ca;;ed 
p1.makepayment("vaibhavkharche@ybl");   // upi is called 
p1.makepayment();


}