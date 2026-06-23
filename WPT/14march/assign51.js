let file=require('fs');
file.writeFileSync('sync.text','I am Vaibhav Kharche i originally from buldhana currently liveing in pune');
let c=file.readFileSync('sync.text',"utf8");
console.log(c);