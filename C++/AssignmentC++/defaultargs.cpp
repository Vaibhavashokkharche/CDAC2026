#include<iostream>
using namespace std;
void add(int=10, int=20);
int main(){

add();
add(50);
add(10,20);


}
void add(int a,int b){
    cout<<a+b<<endl;
}