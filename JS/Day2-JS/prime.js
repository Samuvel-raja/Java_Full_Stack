
let dis = document.querySelector(".dis");
let btn = document.querySelector(".btn");
let c = 0;
btn.addEventListener("click", () => {
    let num1 = parseInt(document.querySelector(".prime").value);
  for (i = 2; i <= num1 / 2; i++) {
    if (num1 % i == 0) {
      c = 1;
      break;
    }
  }
  if (c == 1) 
    dis.innerText = "Not a Prime number";
  else 
    dis.innerText = "Prime number";
});
