// leetcode problem 121 best time to buy and sell stock
var maxProfit = function (prices) {
  let max = 0;
  let min = Infinity;
  for (let price of prices) {
    min = Math.min(min, price);
    max = Math.max(max, price - min);
  }
  return max;
};
