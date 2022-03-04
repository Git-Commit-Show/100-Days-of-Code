// Old Syntax
function oldOne() {
    console.log("Hello World..!");
}
oldOne();

var newOne = () => {
    console.log("Hello world ....");
}
newOne();

let NewOneWithParameters = (a, b) => {
    console.log(a + b); // 30
}
NewOneWithParameters(10, 20);

let Func = (a, b = 10) => {
    return a + b;
}
console.log(Func(20)); // 20 + 10 = 30
console.log(Func(20, 50)); // 20 + 50 = 70

let NotWorkingFunction = (a = 10, b) => {
    return a + b;
}
console.log(NotWorkingFunction(20)); // NAN. Not gonna work.
console.log(NotWorkingFunction(20, 30)); // 50;)