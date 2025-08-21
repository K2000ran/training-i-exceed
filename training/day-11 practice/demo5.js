//rest argument in js

function myDetail(name,age,mail,...args){
    let arg=Array.from(arguments);
    console.log(arguments[3]);
    console.log(arg.sort());
    console.log(arguments[3]);

}
myDetail("kiran",2,"kiranmahato5253@gmail.com","Nepal","asia","book");
