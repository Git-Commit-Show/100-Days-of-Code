var sets = new Set();
sets.add('a');
sets.add('b');
sets.add('a'); // We are adding duplicate value.

for (let element of sets) {
    console.log(element);
}

var sets = new Set([1,5,6,8,9]);
console.log(sets.size); // returns 5. Size of the set.
console.log(sets.has(1)); // returns true. 
console.log(sets.has(10)); // returns false.