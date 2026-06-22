#include <iostream>
using namespace std;
class MyDate{
	int day, month, year;

	public:
	MyDate(){             //These is No args constructor and the value is assign by the constructor for class attribuate.

        day=31;
        month=12;
        year=2000;
    }
	void display(){
		cout <<"date is "<<day<<"/"<<month<<"/"<<year<<endl;
	}
	void setDay(int d){
		cout <<"setter function is called";
		day=d;
	}
	void setMonth(int m){
	cout <<"Setter fuction for month is called\n";
	month=m;
	}

	void setYear(int y){
		year=y;
	}
	int getYear(){
		return year;
	}
};
int main(){
	MyDate d1;
	cout<<"Size of object d1 is"<<sizeof(d1)<<endl;
	d1.display();
	// d1.setDay(11);
	d1.display();
	int r =d1.getYear();
	

    cout<<r<<endl;
	return 0;
	
}
