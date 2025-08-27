const person={
    name:"kiran",
    age:30,
    address:"nepal",
    fav_color:"green",
    fov_food:"apple"
};
const collage={
    collage_name:"AMRITA COLLAGE",
    RollNo: "AM.EN.U4CSE21179",
    sec:"Cse A"

};
const result=Object.assign(person,collage);
console.log(result);
for(let i in result ){
    if(person[i]==="green"){
        console.log(" hurray agot it",i);
    }
}