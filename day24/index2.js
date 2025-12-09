const person = {
    name: "zoro",
    age: 25,
    profession: "Developer"
  };
  console.log(Object.keys(person)); 
  console.log(Object.values(person)); 
  console.log(Object.entries(person));
const additionalInfo = { country: "USA" };
const updatedPerson = Object.assign({}, person, additionalInfo);
console.log(updatedPerson);
console.log(person.hasOwnProperty("age")); 

console.log(person.name);       
console.log(person.age);        
console.log(person.profession);  

// Using bracket notation
console.log(person["name"]);        
console.log(person["age"]);       
console.log(person["profession"]);  