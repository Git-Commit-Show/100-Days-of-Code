// example callback
setTimeout(function () {
    myFunction("hehehehe");
}, 3000);
console.log("before call myFunction");
function myFunction(value) {
    console.log(value);
}
console.log("after call myFunction");

function myDisplayer(some, data = "body") {
    console.log(some + " " + data);
}

function myFirst() {
    myDisplayer("Hello");
}

function mySecond() {
    myDisplayer("Goodbye");
}

myFirst();
mySecond();

function myCalculator(num1, num2) {
    let sum = num1 + num2;
    return sum;
}

let result = myCalculator(5, 5);
myDisplayer(result);

function myCalculator2(num1, num2) {
    let sum = num1 + num2;
    myDisplayer(sum);
}

myCalculator2(5, 5);

function myCalculator3(num1, num2, myCallback) {
    let sum = num1 + num2;
    myCallback(sum);
}

myCalculator3(5, 5, myDisplayer);