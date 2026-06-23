// in Employee.js file 
//    create Employee class 
//     take firstName , lastName , email , designation 
//      basicSalary 
//    input from constructor 
   
//    in Employee class 
//      write display method which display employee details
//    write setter and getter methods for each variable 
export class Employee{
firstname;
lastName;
email;
designtaion;
basicSalary;
constructor(fname,lname,e,d,bs){

    this.firstname=fname;
    this.lastName=lname;
    this.email=e;
    this.designtaion=d;
    this.basicSalary=bs;
};

SetFname(fname){
    this.firstname=fname;
};
GetFname(){
    return this.firstname;
};

 display() {
    console.log(`FirstName is ${this.firstname} lastName ${this.lastName} email ${this.email} designation ${this.designtaion} basicSalary is ${this.basicSalary}`);
    
}

};

let a= new Employee("Vaibhav","Kharche","v@gmail.com","SDET", 25000);
a.SetFname("Komal");

console.log(a.GetFname());
a.display();

