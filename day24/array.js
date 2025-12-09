const fruits = ["apple", "banana", "orange"];
fruits.push("grape");
console.log(fruits); // Output: ["apple", "banana", "orange", "grape"]

fruits.pop();
console.log(fruits); // Output: ["apple", "banana", "orange"]

fruits.shift();
console.log(fruits); // Output: ["banana", "orange"]

fruits.unshift("kiwi");
console.log(fruits); // Output: ["kiwi", "banana", "orange"]

const veggies = ["carrot", "spinach"];
const food = fruits.concat(veggies);
console.log(food); // Output: ["kiwi", "banana", "orange", "carrot", "spinach"]

console.log(fruits.join(", ")); // Output: "kiwi, banana, orange"

console.log(fruits.slice(1, 3)); // Output: ["banana", "orange"]

fruits.splice(1, 1, "mango"); // Replaces 2 element at index 1

console.log(fruits); // Output: ["kiwi", "mango", "orange"]

const lengths = fruits.map(fruit => fruit.length);
console.log(lengths); // Output: [4, 5, 6]

const longNames = fruits.filter(fruit => fruit.length > 5);
console.log(longNames); // Output: ["orange"]

const numbers = [1, 2, 3, 4];
const sum = numbers.reduce((total, num) => total + num, 0);
console.log(sum); // Output: 10

console.log(fruits.find(fruit => fruit.startsWith("o"))); // Output: "orange"

console.log(fruits.includes("banana")); // Output: false
