// 1. Object.assign – Merge properties
const target = { a: 1 };
const source = { b: 2 };
const merged = Object.assign(target, source);
console.log("Merged:", merged); // { a: 1, b: 2 }

// 2. Object.create – Create object with prototype
const proto = { greet() { return "Hello"; } };
const obj1 = Object.create(proto);
console.log("Greet from proto:", obj1.greet()); // Hello

// 3. Object.defineProperty – Add property with descriptor
const obj2 = {};
Object.defineProperty(obj2, "secret", {
  value: "hidden",
  writable: false,
  enumerable: false
});
console.log("Secret:", obj2.secret); // hidden

// 4. Object.entries – Get [key, value] pairs
const obj3 = { x: 10, y: 20 };
console.log("Entries:", Object.entries(obj3)); // [['x', 10], ['y', 20]]

// 5. Object.fromEntries – Convert pairs to object
const pairs = [["name", "Aarav"], ["age", 25]];
const obj4 = Object.fromEntries(pairs);
console.log("From Entries:", obj4); // { name: 'Aarav', age: 25 }

// 6. Object.freeze – Make object immutable
const obj5 = { mood: "happy" };
Object.freeze(obj5);
obj5.mood = "sad"; // No effect
console.log("Frozen mood:", obj5.mood); // happy

// 7. Object.getOwnPropertyDescriptor
console.log("Descriptor of 'secret':", Object.getOwnPropertyDescriptor(obj2, "secret"));

// 8. Object.getPrototypeOf
console.log("Prototype of obj1:", Object.getPrototypeOf(obj1)); // proto

// 9. Object.hasOwn – Check own property
console.log("Has 'name':", Object.hasOwn(obj4, "name")); // true

// 10. Object.is – Strict comparison
console.log("Is NaN same as NaN:", Object.is(NaN, NaN)); // true
console.log("Is -0 same as +0:", Object.is(-0, +0)); // false

// 11. Object.keys & Object.values
console.log("Keys:", Object.keys(obj3)); // ['x', 'y']
console.log("Values:", Object.values(obj3)); // [10, 20]

// 12. Object.seal – Prevent adding/removing properties
const obj6 = { status: "active" };
Object.seal(obj6);
obj6.status = "inactive"; // Allowed
delete obj6.status;       // Not allowed
console.log("Sealed object:", obj6);

// 13. Object.preventExtensions – Block new properties
const obj7 = { id: 101 };
Object.preventExtensions(obj7);
obj7.newProp = "nope"; // Ignored
console.log("Prevented extensions:", obj7);

// 14. Object.setPrototypeOf – Change prototype
const newProto = { sayHi() { return "Hi!"; } };
Object.setPrototypeOf(obj4, newProto);
console.log("Say Hi:", obj4.sayHi()); // Hi!
