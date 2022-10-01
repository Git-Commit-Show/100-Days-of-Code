// leetcode problem 232 Implement Queue using Stacks

var MyQueue = function () {
  this.first = [];
  this.second = [];
};

/**
 * @param {number} x
 * @return {void}
 */
MyQueue.prototype.push = function (x) {
  this.first.push(x);
};

/**
 * @return {number}
 */
MyQueue.prototype.pop = function () {
  while (this.first.length) {
    this.second.push(this.first.pop());
  }
  // 1 2 3
  // 3 2 1
  let result = this.second.pop();

  while (this.second.length) {
    this.first.push(this.second.pop());
  }
  return result;
};

/**
 * @return {number}
 */
MyQueue.prototype.peek = function () {
  while (this.first.length) {
    this.second.push(this.first.pop());
  }
  let result = this.second[this.second.length - 1];
  while (this.second.length) {
    this.first.push(this.second.pop());
  }
  return result;
};

/**
 * @return {boolean}
 */
MyQueue.prototype.empty = function () {
  return this.first.length === 0;
};

/**
 * Your MyQueue object will be instantiated and called as such:
 * var obj = new MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */
