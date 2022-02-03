// leetcode problem 435 Non-overlapping intervals
var eraseOverlapIntervals = function (intervals) {
  intervals.sort((a, b) => a[0] - b[0]);
  let num = intervals.length;
  let res = 0;
  let i = num - 1;
  while (i > 0) {
    let j = i - 1;
    while (j >= 0 && intervals[j][1] > intervals[i][0]) {
      res++;
      j--;
    }
    i = j;
  }
  return res;
};
