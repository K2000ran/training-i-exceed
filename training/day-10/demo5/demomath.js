
// Custom Math Library
const MyMathLib = {
    add: (a, b) => a + b,
    subtract: (a, b) => a - b,
    multiply: (a, b) => a * b,
    divide: (a, b) => b !== 0 ? a / b : 'Error: Division by zero',
    square: x => x * x,
    cube: x => x * x * x,
    sqrt: x => Math.sqrt(x),
    power: (base, exponent) => Math.pow(base, exponent),
    factorial: function (n) {
        if (n < 0) return 'Error: Negative number';
        let result = 1;
        for (let i = 2; i <= n; i++) result *= i;
        return result;
    },
    randomInt: (min, max) => Math.floor(Math.random() * (max - min + 1)) + min
};

// Example usage
console.log("Add:", MyMathLib.add(5, 3));           // 8
console.log("Subtract:", MyMathLib.subtract(10, 4)); // 6
console.log("Multiply:", MyMathLib.multiply(7, 6));  // 42
console.log("Divide:", MyMathLib.divide(12, 4));     // 3
console.log("Square:", MyMathLib.square(5));         // 25
console.log("Cube:", MyMathLib.cube(3));             // 27
console.log("Sqrt:", MyMathLib.sqrt(49));            // 7
console.log("Power:", MyMathLib.power(2, 5));        // 32
console.log("Factorial:", MyMathLib.factorial(5));   // 120
console.log("Random Int:", MyMathLib.randomInt(1, 100)); // Random number between 1–100
