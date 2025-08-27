const vechile = {
    isAvailable: true,
    canDrive: function () {
        console.log("vechile is in good condition");
    },
    tyre: 5,
    color: "red",
    condition: function (km) {
        return (km > 50 && this.isAvailable) ? "okay you can book " : "No you can not have car";
    }

}
console.log(vechile.condition(67));
const car = Object.create(vechile);
car.color = "blue";
car.type = 5;
car.isAvailable = false;
car.owner = "kiran ";
car.detail = function () {
    return(`Owner: ${this.owner}, Color: ${this.color}, Type: ${this.type},isAvailable:  ${this.isAvailable}`);
};
//console.log(car.owner);
console.log(car.condition(67));
console.log(car.detail());