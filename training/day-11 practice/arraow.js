//multiply to two number with arrow function
const mul=(x,y)=>{
    let res=x*y;
    return res;
}
console.log("the x * y is : ",mul(12,10));


// examle of arrow function

function  multipy(){
    console.log("hello");
}
multipy();


//changing the string in lowerCase
let getMe=(x)=>x.toLowerCase();
console.log(getMe("KIRAN"));
//making gmail with arraow function
let myMail=(name,age,city)=>name+age+city + "@"+"gmail.com";
console.log(myMail("kiran",5253,"nepal"));



