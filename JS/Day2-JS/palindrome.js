
let dis = document.querySelector(".dis");
let btn = document.querySelector(".btn");

btn.addEventListener("click", () => {
    let val = document.querySelector(".pal").value;
    let rev=val.split("").reverse().join("");
    console.log(rev);
  if (val== rev) 
    dis.innerText = "Palindrome";
  else 
    dis.innerText = "Not a Palindrome";
});
