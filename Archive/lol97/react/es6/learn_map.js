var NewMap = new Map();
NewMap.set('name', 'John');
NewMap.set('id', 2345796);
NewMap.set('interest', ['js', 'ruby', 'python']);

console.log(NewMap.get('name')); // John
console.log(NewMap.get('id')); // 2345796
console.log(NewMap.get('interest')); // ['js', 'ruby', 'python']

var map = new Map();
map.set('name', 'John');
map.set('name', 'Andy');
map.set(1, 'number one');
map.set(NaN, 'No value');

console.log(map.get('name')); // Andy. Note John is replaced by Andy.
console.log(map.get(1)); // number one
console.log(map.get(NaN)); // No value
console.log(map.size);
for (let key of map.keys()) {
    console.log(key);
}

for (let elemet of map) {
    console.log(elemet);
}

for (let [key, value] of map) {
    console.log(key + " - " + value);
}