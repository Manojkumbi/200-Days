function greet(name) {
    return `Hello, ${name}!`;
  }
  //   Hoisted to the top of their scope, so they can be called before they are defined in the code.
console.log("function");

  console.log(greet("Zoro")); // Output: "Hello, Alice!"

const greetex = function(name) {
    return `Hello, ${name}!`;
  };
  console.log("expression");
  
  //   Not hoisted, so it can only be called after it is defined.
//   Useful when you want to assign a function to a variable or pass it as an argument.
console.log(greetex("Bob")); // Output: "Hello, Bob!"

const greetar = (name) => `Hello, ${name}!`;
// it doesn't have its this context
console.log("arrow");

console.log(greetar("Charlie")); // Output: "Hello, Charlie!"

function param(params) {
    let name="goku";
    console.log("callback");   
    params(name)
}
function calculate(operation, a, b) {
    return operation(a, b);
  }
  
  const add = (x, y) => x + y;
  const result = calculate(add, 5, 3);
  
  console.log(result); // Output: 8
  