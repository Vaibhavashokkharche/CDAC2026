// 2)  declare 1 variable which contains data for 
// Object format convert that data in json format
// and again in Object Format 

let data={
firstName:"Vaibhav",
lastName:"Kharche",
Address:"Pune"
};
console.log(typeof(data));   //Object>>Json (Stringfy)
let d =JSON.stringify(data);
console.log(typeof(d));
console.log(d);
let c=JSON.parse(d);     //Json>> object (Parse) 
console.log(typeof(c));