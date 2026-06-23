// example of async and await keyword
async function f1(){

return Promise.resolve("a");
}
async function f2(){
 let c= await f1();
  return c;
}


console.log(f2());