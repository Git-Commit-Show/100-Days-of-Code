function simpleArraySum(ar) {
  // Write your code here
  for (
    var index = 0, // The iterator
      length = ar.length, // Cache the array length
      sum = 0; // The total amount
    index < length; // The "for"-loop condition
    sum += ar[index++] // Add number on each iteration
  );
  return sum;
}
