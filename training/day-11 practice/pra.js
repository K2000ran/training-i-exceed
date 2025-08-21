// working with two function with arrow function
let change = (x) => (x.trim()).toUpperCase();
console.log(change("  kiran"));
// working with two function in arrow function
let cha = () => "  kiran".trim().toUpperCase();
console.log(cha());
//concating the mail with arrow function
let mail = x => x + "@gmail.com";
console.log(mail("kiran"));
//arrow function with working with two argument

let change1 = (x, y) => {
    return x.toUpperCase() + "\t" + y.toLowerCase();
};
console.log(change1("kiran", "KUMAR"));