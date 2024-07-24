
let dis = document.querySelector(".dis");
let btn = document.querySelector(".btn");

btn.addEventListener("click", () => {
    let num1 = parseInt(document.querySelector(".pat").value);
    dis.innerHTML+="<br><br><br>"
  for (i = 1; i <= num1; i++) {
    for(j=1;j<=i;j++)
    {
       dis.innerHTML+="* "
    }
    dis.innerHTML+="<br>"
    }
  }

);
