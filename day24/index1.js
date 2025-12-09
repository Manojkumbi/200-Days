let age = 18;

if (age >= 18) {
  console.log("You are an adult.");
} else {
  console.log("You are a minor.");
}

for (let i = 0; i < 5; i++) {
    if (i==2) break;
    console.log("Number:", i);
  }

  

let day = 3;
let dayName;

switch (day) {
  case 1:
    dayName = "Monday";
    break;
  case 2:
    dayName = "Tuesday";
    break;
  case 3:
    dayName = "Wednesday";
    break;
  default:
    dayName = "Unknown day";
}

console.log(dayName); 
let i = 0;

while (i < 5) {
    if (i==2){ 
        i++;
        continue;
    }
  console.log("Number:", i);
  i++;
}

let j = 0;

do {
  console.log("Number:", j);
  j++;
} while (j < 5);
