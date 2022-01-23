# Day -1 of HackerRank 3 Months Preparation Kit

## [Plus Minus](https://www.hackerrank.com/challenges/three-month-preparation-kit-plus-minus/problem)
~~~javascript
function plusMinus(arr) {
    // Write your code here
    let plus=0;
    let minus=0;
    let zero=0;
    arr.forEach((item) => {
        (item>0) ? plus++ : (item<0) ? minus++ : zero++;
    });
    console.log((plus/(plus+minus+zero)).toFixed(6))
    console.log((minus/(plus+minus+zero)).toFixed(6))
    console.log((zero/(plus+minus+zero)).toFixed(6))
    
}
~~~
## [Mini-Max Sum](https://www.hackerrank.com/challenges/three-month-preparation-kit-mini-max-sum/problem)
~~~javascript
function miniMaxSum(arr) {
    // Write your code here
    let sum = arr.reduce((a, b) => a + b);
    let maxVal = arr.reduce((a,b) => { return a>b?a:b})
    let minVal = arr.reduce((a,b) => { return a<b?a:b})
    console.log((sum - maxVal) + ' ' + (sum - minVal));
}
~~~
## [Time Conversion](https://www.hackerrank.com/challenges/three-month-preparation-kit-time-conversion/problem)
~~~javascript
function timeConversion(s) {
    // Write your code here
    let [hr,mn,sc] = s.split(":");
    let clk = sc.substring(2,4);
    sc = sc.substring(0,2);
    let newTime;
    if(clk === "AM" && hr < 12){
        newTime = hr+":"+mn+":"+sc;
    }
    if(clk === "PM" && hr < 12){
        newTime = (parseInt(hr)+12)+":"+mn+":"+sc;
    }
    if(clk === "AM" && hr == 12){
        newTime = "00:"+mn+":"+sc;
    }
    if(clk === "PM" && hr == 12){
        newTime = (hr+":"+mn+":"+sc);
    }
    return newTime;
}
~~~
## [Breaking the Records](https://www.hackerrank.com/challenges/three-month-preparation-kit-breaking-best-and-worst-records/problem)
~~~javascript
function breakingRecords(scores) {
    // Write your code here
    let minScore = scores[0];
    let maxScore = scores[0];
    let minRecord = 0;
    let maxRecord = 0;
    scores.forEach((item)=>{
        
        if(item < minScore){
            minScore = item;
            minRecord++;
        }
        if(item > maxScore){
            maxScore = item;
            maxRecord++;
        }
    });
    return [maxRecord,minRecord];
}
~~~