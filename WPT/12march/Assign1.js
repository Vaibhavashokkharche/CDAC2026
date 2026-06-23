// create 1 object which contains Book details 
//   and display data using by destructing that object 


let data ={
  bookId: 101,
  bookName:"Winner",
  price:250,

}
// for (const key in data) {
//     if (Object.hasOwnProperty.call(data, key)) {
//         const element = data[key];
//         console.log(key+" "+element)
        
//     }} Destruct the object and copy the key of object in third varible
let {bookId:id1,bookName:n1}=data;
console.log("Id: "+id1+ "BookName: "+n1);

let arrayobject=[
{firstName:"Vaibhav", lastName:"Kharche", age:25},
{firstName:"Shubham", lastName:"Patil", age:23},
{firstName:"Anurag", lastName:"Deshmukh", age:18},
{firstName:"Rushikesh", lastName:"Narkhede", age:16},

];
let[{firstName:fname, lastName:lname, age:a}]=arrayobject;
console.log("FirstName: "+fname+" Lastname: "+lname+" Age "
+a);