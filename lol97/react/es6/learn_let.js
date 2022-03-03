if(true){
    let a = 40;
    console.log(a);
}
// console.log(a); //undefined

let a = 50;
let b = 100;
if(true){
    let a = 60;
    var c = 10;
    console.log(a/c); // 6
    console.log(b/c); // 10
}
console.log(c); // 10
console.log(a); // 50