let boxs=document.querySelector(".box");
let reset=document.querySelector("#reset");
let turnO=true; //true then o turn false then x turn
const winpattern=[[0,1,2],[3,4,5],[6,7,8],[0,4,8],[2,4,6],[0,3,6],[1,4,7],[2,5,8]];
boxs.forEach((box)=>{
    box.addEventLisner("click",()=>{
        console.log("button was clicked");
    });
});
