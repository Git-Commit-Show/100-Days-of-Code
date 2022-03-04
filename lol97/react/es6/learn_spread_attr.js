arr = [10, 20, 40, 60, 90];
let SumElements = (arr) => {
    console.log(arr); // [10, 20, 40, 60, 90]
}
SumElements(arr);

let sum = 0;
for (let element of arr) {
    sum += element;
}
console.log(sum); // 220. 