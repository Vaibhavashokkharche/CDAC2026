#include <iostream>
using namespace std;

class Account{
 int accno, balance;

 public:
  void accpet(){
 cout<<"enter the account number\n";
 cin>>accno;
 cout<<"enter the amount ";
cin>>balance;
  }


  void display(){

    cout<<"The account number is = "<<accno<<endl;
    cout<<"The balance in account = "<<balance<<endl;
  }
 void withdraw(int amt){
 if(amt<balance){
  balance= balance-amt;
 }else{
  cout<<"insufficient Balance";
 }

 }

 int getBalance(){

  
  cout<<"The reamaining balance is"<<balance;
  return balance;
 }
 void deposit(int amt){
  cout<<"Enter the acount number\n";
  int accnod;
  cin>>accnod;
  if(accnod=accno){
    balance = balance+amt;
    cout<<"Amount deposit succesfully.  Avaialble Balance"<<balance;
  }else{
    cout<<"Wrong Account number";
  }

 }

};


int main(){

Account a1;
a1.accpet();
a1.display();
a1.withdraw(100);
a1.getBalance();
a1.deposit(500);
}
