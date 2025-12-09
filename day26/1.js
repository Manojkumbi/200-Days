let fruits = ["apple", "banana", "cherry"];
console.log(fruits[1]); 
// arrays
fruits.push("orange"); 
fruits.pop();          
console.log(fruits); 

// objects
let person = {
    name: "Alice",
    age: 25,
    occupation: "Developer"
  };
console.log(person.name); 
console.log(person["age"]);

// sets
let uniqueNumbers = new Set([1, 2, 3, 3, 4]);
uniqueNumbers.add(5);
console.log(uniqueNumbers); 
uniqueNumbers.delete(1);
console.log(uniqueNumbers.has(1)); 

// maps
let userRoles = new Map();
userRoles.set("Alice", "Admin");
userRoles.set("Bob", "User");
console.log(userRoles.get("Alice"));
console.log(userRoles.has("Bob")); 

// weakset
let person1 = { name: "Alice" };
let person2 = { name: "Bob" };
let userGroup = new WeakSet([person1, person2]);
console.log(userGroup.has(person1)); 
person1 = null;

// weakmap
let user = { name: "Alice" };
let weakMap = new WeakMap();
weakMap.set(user, "Admin");
console.log(weakMap.get(user)); 
user = null;                    



  