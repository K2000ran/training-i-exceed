let accountBalance = 1000000000000000000n; // 1 quintillion
console.log(`Account Balance: ₹${accountBalance}`);
let balance = 5000000000000000000n;

function deposit(amount) {
    balance += BigInt(amount);
}

function withdraw(amount) {
    balance -= BigInt(amount);
}

deposit(1000000000000000000n);
withdraw(2000000000000000000n);

console.log(`Final Balance: ₹${balance}`);

const a = 10n;
const b = 5;
console.log(a + b); //  TypeError

const maxSafe = Number.MAX_SAFE_INTEGER; // 9007199254740991
const beyond = BigInt(maxSafe) + 2n;
console.log(beyond); // 9007199254740993n

let principal = 10000000000000000000n; // ₹10 quintillion
let rate = 5n; // 5% annual interest
let years = 3n;

let interest = (principal * rate * years) / 100n;
let total = principal + interest;

console.log(`Interest: ₹${interest}`);
console.log(`Total after ${years} years: ₹${total}`);

let transactions = [
    { type: "deposit", amount: 2000000000000000000n },
    { type: "withdrawal", amount: 1000000000000000000n },
    { type: "deposit", amount: 3000000000000000000n }
];

let balancee = 0n;

for (let tx of transactions) {
    if (tx.type === "deposit") balancee += tx.amount;
    else if (tx.type === "withdrawal") balancee -= tx.amount;
}

console.log(`Final Balance: ₹${balancee}`);


