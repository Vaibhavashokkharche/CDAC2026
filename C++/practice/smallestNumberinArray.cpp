#include <iostream>
using namespace std;
int main(){
    int i,j;
    int min;
int a[5]={12,2,14,16,15};
//Smallest Number in array

for(i=0;i<5;i++){
    for(j=1;j<5;j++){
        if(a[i]>a[j]){
            int temp=a[i];
            a[i]=a[j];

            a[j]=temp;
        }

 }



    }
  cout<<"The smallest number in array is"<<a[0];

}


