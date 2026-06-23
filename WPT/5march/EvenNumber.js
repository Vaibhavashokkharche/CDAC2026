let data=[3,12,14,15,20,88,98,65,56,59];

function toCheckEvenNumber(n){
    if(n%2==0){
        console.log(n+" Even number")
    }
    else{

        console.log(n+" odd number")
    }

}
// for(var i=0;i<data.length;i++){   ///simple for loop

//     toCheckEvenNumber(data[i])
// }
for (const itr of data) { //to extract the data from for loop without using normal for loop
    if (itr%2==0) {           //its not required a condition like nomal loop
    console.log(itr+" Even number");
    }  
    else{
        console.log(itr+" odd Number ")
    }
}
