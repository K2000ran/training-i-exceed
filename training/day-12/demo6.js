const d = new Date();
console.log("the time is : ",d);
//converting string into date
const d1 = new Date("October 13, 2014 11:13:00");
console.log(typeof d1);
console.log(d1 instanceof Date);
//representation of  date in to string into different format
const D=new Date();
console.log("The string represent :",D.toString());
//represent of date in more readable for
console.log("the date in more readable form is : ",D.toDateString());
//ist time
console.log("the UST time is :",D.toUTCString());

//UTC TIME
console.log("the IST time is :",D.toISOString());
console.log("the year is : ",D.getFullYear());

