#include <iostream>
using namespace std;
class Student{
    public:
    int rollnum; float tm; string name, dob;

   public:
    Student(string n,int r, string d, float t){
        name=n;
        rollnum=r;
        dob=d;
        tm=t;
    }
    
     void display(){
     cout<<name<<" "<<rollnum<<" "<<dob<<" "<<tm<<endl;
    
     }
     



};
int main(){
    int i,j,n;
Student s[10]={
Student("Vaibhav",102,"18/02/2000",79.80),
Student("Vaibhavi",101,"19/02/2000",80.80),
Student("Esha",103,"02/02/2000",81.80),
Student("Shubham",109,"01/02/2000",69.80),
Student("Vaishanavi",107,"05/02/2000",59.80),
Student("Prajkta",106,"06/02/2000",78.80),
Student("Dhiraj",108,"09/02/2000",76.80),
Student("Tejas",104,"14/02/2000",71.80),
Student("Komal",105,"12/02/2000",73.80),
Student("Mounika",111,"22/02/2000",74.80),

};
//filter out with roll number

    for(i=0;i<9;i++){
        for(j= i+1;j<10; j++){
        if(s[i].rollnum>s[j].rollnum){

            Student temp= s[i];
            s[i]=s[j];
            s[j]=temp;

        }


        }
        


    }



for(n=0;n<=10;n++){
           s[n].display();

        }




}