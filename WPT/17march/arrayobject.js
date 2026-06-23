const names={
    firstName:"Vaibhav",
    lastName:"Kharche",
    age:22,
    fullName : function(){
        return `${this.firstName} "" ${this.lastName} age is ${this.age}` ;
    }
};


for (const iterator of names) {
    console.log(iterator);
    
}