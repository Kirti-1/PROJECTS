// functions are hoisted
// let are not hoisted
// why are we able to call the function before it has been declared? - hoisting
cool()
function cool(){
    console.log("Hellooooooooo");
}
// whereas variable declared as let not get hoisted
// template literal
// backticks ``
let my_name  = "kirti"
console.log(`helloooooo my name is ${my_name}, How are you??`);
// something dynamic
