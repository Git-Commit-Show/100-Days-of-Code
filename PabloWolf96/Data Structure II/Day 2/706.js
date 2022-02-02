// leetcode problem 706 Design HashMap
var MyHashMap = function (maxLength = 1e5, buckets = []) {
  this.maxLength = maxLength;
  this.buckets = buckets;
};

MyHashMap.prototype.getIndex = function (key) {
  return key % this.maxLength;
};

MyHashMap.prototype.getPos = function (key, index) {
  if (this.buckets[index] === undefined) return -1;
  for (let i = 0; i < this.buckets[index].length; i++) {
    if (this.buckets[index][i][0] === key) return i;
  }
  return -1;
};

MyHashMap.prototype.put = function (key, value) {
  index = this.getIndex(key);
  pos = this.getPos(key, index);
  if (pos < 0) {
    if (this.buckets[index] === undefined || this.buckets[index].length === 0) {
      this.buckets[index] = [];
      this.buckets[index].push([key, value]);
    }
  } else {
    this.buckets[index][pos] = [key, value];
  }
};

MyHashMap.prototype.get = function (key) {
  index = this.getIndex(key);
  pos = this.getPos(key, index);
  if (pos > -1) {
    return this.buckets[index][pos][1];
  }
  return -1;
};

MyHashMap.prototype.remove = function (key) {
  index = this.getIndex(key);
  pos = this.getPos(key, index);
  if (pos > -1) {
    this.buckets[index].splice(pos, 1);
  }
};
