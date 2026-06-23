let students=[
{fname:"Vaibhav", lname:"Kharche", marks:55},
{fname:"Vaishanavi", lname:"Patil", marks:55},
{fname:"Rushikesh", lname:"Mane", marks:55},
{fname:"Sharad", lname:"Borle", marks:55},

];

let obj_copy=[...students];
let obj_copy2=JSON.stringify(obj_copy);
console.log(students);
console.log(obj_copy2);


students.map((student,index)=>{
   
console.log(index+" "+student.fname +" "+student.lname+" "+student.marks);

});