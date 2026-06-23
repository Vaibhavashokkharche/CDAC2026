// Create JSON object
let student = {
    rollnumber: 101,
    name: "Vaibhav",
    marks: 85
};

// Create a copy using spread operator
let obj_copy = { ...student };

// Change marks in the first object
student.marks = 95;

// Print both
console.log("Original Object:", student);
console.log("Copied Object:", obj_copy);