 function validate(){
    data=document.getElementById('a1').value;
   var i = data.indexOf('@');
   if(i>0){
    var j = data.lastIndexOf('.');
    if (j > i) {
        console.log("Valid Format");
    }
    else {
        console.log("Invalid Format ");
    }
}
else {
    console.log("Invalid Format ");
}
}
 