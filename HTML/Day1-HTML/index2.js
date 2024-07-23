const btn = document.querySelector(".btn");
const left = document.querySelector(".div-left");
const right = document.querySelector(".div-right");
const head = document.querySelector(".header");
let con=false;
btn.addEventListener("click", () => {
 con=!con
 if(con==true)
 {
  head.style.backgroundColor = "black";
  head.style.color = "aqua";
  left.style.backgroundColor = "black";
  left.style.color = "aqua";
  right.style.backgroundColor = "black";
  right.style.color = "aqua";
  left.style.border = "2px yellow solid";
  right.style.border = "2px yellow solid";

 }
 else if(con==false)
 {
    head.style.backgroundColor = "white";
  head.style.color = "black";
  left.style.backgroundColor = "white";
  left.style.color = "black";
  right.style.backgroundColor = "white";
  right.style.color = "black";
  left.style.border = "2px grey solid";
  right.style.border = "2px grey solid";
 }
});
