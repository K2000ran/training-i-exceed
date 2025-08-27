//1. Object Literal
const user = {
    name: "Aarav",
    age: 30,
    greet() {
        console.log(`Hi, I'm ${this.name}`);
    }
};


//2. Using new Object() Constructor
const car = new Object();
car.brand = "Toyota";
car.model = "Innova";


//. Using Object.create() for Prototypal Inheritance
const vehicle = {
    move() {
        console.log("Vehicle is moving");
    }
};

const bike = Object.create(vehicle);
bike.type = "Bike";
bike.move(); // Inherited from vehicle



// Constructor Function

function Person(name, age) {
    this.name = name;
    this.age = age;
}

const p1 = new Person("Kiran", 28);


