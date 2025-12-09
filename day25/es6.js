const numbers = [1, 2, 3];
const [a,b]=numbers
console.log(a,b);

const moreNumbers = [...numbers];
console.log(moreNumbers); 

const person = { name: "Alice", age: 25 };
const {name,age}=person
console.log(name,age);

const updatedPerson = { ...person, profession: "Developer" };
console.log(updatedPerson); 

console.log(`hello i am ${name} and i am ${age} old`);

