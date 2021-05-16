# Codecademy
This is a repository for all the assements That I had during the Codecademy courses
const kelvin = 0;
// Kelvin 293 is a constant variable
const celsius = kelvin - 273;
// celsius is a constant variabel 273 less the a kelvin
let fahrenheit = celsius * (9 / 5) + 32;
//variable fahrenheit is celsius X (9/5)+32
fahrenheit = Math.floor(fahrenheit);
// expected output: round down 
console.log(`The temperature os ${fahrenheit} degrees Fahrenheit.`);
//Convert Newton
let Newton = celsius * (33 / 100);

// Round down Newton
Newton = Math.floor(celsius);
console.log(`The temperature is ${Newton} degrees Newton.`);
