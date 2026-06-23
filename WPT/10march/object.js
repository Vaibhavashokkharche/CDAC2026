//Create a object  and diaplay the elements of array using for in loop
let b={
    id:100,
    name:"Vaibhav",
    email:"vkharc2@ext.uber.com"
}
for (const key in b) {
    if (Object.hasOwnProperty.call(b, key)) {
        const element = b[key];
        console.log(key+ " "+element)
    }
}