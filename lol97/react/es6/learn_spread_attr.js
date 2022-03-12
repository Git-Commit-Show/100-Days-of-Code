let arr = [10, 20, 40, 60, 90];
let SumElements = (arr) => {
    console.log(arr); // [10, 20, 40, 60, 90]
}
SumElements(arr);

let sum = 0;
for (let element of arr) {
    sum += element;
}
console.log(sum); // 220. 


let SumElements2 = (...arr) =>{
    console.log(arr);

    let sum = 0;
    for (let element of arr){
        sum+=element;
    }
    console.log(sum);
}
SumElements2(10, 20, 40, 60, 90);

SumElements2(...arr);

console.log(Math.max(10, 20, 60, 100, 50, 200));
console.log(Math.max(...arr));