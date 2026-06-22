#include <iostream>
using namespace std;
class MyDate{
	int day, month, year;

	public:
	void accept(){
		cout <<"Enter the day month and Year\n";
		cin>>day>>month>>year;
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
	d1.accept();
	d1.display();
	d1.setDay(11);
	d1.display();
	int r =d1.getYear();
	

    cout<<r<<endl;
	return 0;
	
}
