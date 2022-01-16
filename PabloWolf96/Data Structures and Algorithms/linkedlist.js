class Node {
  constructor(data) {
    this.data = data;
    this.next = null;
  }
}

class LinkedList {
  constructor() {
    this.head = null;
  }
  insert(data) {
    const temp = this.head;
    this.head = new Node(data);
    this.head.next = temp;
  }
}
function printList(head) {
  let current = head;
  while (current) {
    console.log(current.data);
    current = current.next;
  }
}

function sumList(head) {
  let total = 0;
  let current = head;
  while (current) {
    total += current.data;
    current = current.next;
  }
  return total;
}

function isPresent(head, target) {
  let current = head;
  while (current) {
    if (current.data === target) {
      return true;
    }
    current = current.next;
  }
  return false;
}

function getAt(head, index) {
  let current = head;
  let counter = 0;
  while (current) {
    if (counter === index) {
      return current.data;
    }
    counter++;
    current = current.next;
  }
  // edge case where the index is greater than the length of the list
  return null;
}
function reverseList(head) {
  let current = head;
  let prevNode = null;
  while (current) {
    let next = current.next;
    current.next = prevNode;
    prevNode = current;
    current = next;
  }

  return prevNode;
}
let list = new LinkedList();
list.insert(5);
list.insert(4);
list.insert(3);
list.insert(2);
list.insert(1);
printList(list.head);
console.log("-----------------------");
console.log(sumList(list.head));
console.log("-----------------------");
console.log(isPresent(list.head, 5));
console.log(isPresent(list.head, 69));
console.log("-----------------------");
console.log(getAt(list.head, 3));
console.log(getAt(list.head, 69));
console.log("-----------------------");
const reversedList = reverseList(list.head);
printList(reversedList);
