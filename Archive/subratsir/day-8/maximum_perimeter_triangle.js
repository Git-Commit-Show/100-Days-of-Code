// https://www.hackerrank.com/challenges/three-month-preparation-kit-maximum-perimeter-triangle/problem
'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the 'maximumPerimeterTriangle' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY sticks as parameter.
 */

function maximumPerimeterTriangle(sticks) {
    // Write your code here
    sticks.sort((a,b) => a-b);
    let result = [];
    for(let i=sticks.length-3; i>=0; i-=1){
        if(sticks[i]+sticks[i+1] > sticks[i+2]){
            result.push([sticks[i],sticks[i+1],sticks[i+2]])
        }
    }
    if(result.length == 0){
        result.push([-1]);
        return result[0];
    }else if(result.length == 1){
        return result[0];
    }else{
        let max = 0;
        let inn=0;
        result.forEach((a1, index) => {
            if(a1.reduce((a,b)=>a+b) > max) {inn = index; max = a1.reduce((a,b)=>a+b)};
        });
        return(result[inn]);
    }
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const n = parseInt(readLine().trim(), 10);

    const sticks = readLine().replace(/\s+$/g, '').split(' ').map(sticksTemp => parseInt(sticksTemp, 10));

    const result = maximumPerimeterTriangle(sticks);

    ws.write(result.join(' ') + '\n');

    ws.end();
}
