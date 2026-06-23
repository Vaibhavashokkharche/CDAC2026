let a = []; 

function add() {
  
    let myBox = document.getElementById('textField');
    
    
    let textInside = myBox.value;

    if (textInside !== "") {
   
        a.push(textInside); 
        
        console.log("Current Array:", a);

        myBox.value = ""; 
    }
}
function display() {

    
}


