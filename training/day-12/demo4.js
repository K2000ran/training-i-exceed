



let stu = [
    {
        name: "kiran",
        age: 23,
        home: "Dhalalkebra"
    },
    {
        name: "nabin",
        age: 20,
        home: "janakpur"
    },
    {
        name: "santosh",
        age: 20,
        home: "janakpur",
        phoneNo: [9812052163, 1341234],
        educaton: {
            can_read() {
                console.log("santosh can read english but cant speak");
            },
            can_write() {
                console.log("he cant write");
            }

        }
    }
];

console.log(stu[2].phoneNo[1]); // Output: 1341234
console.log(stu[1].name);
stu[2].educaton.can_write();

