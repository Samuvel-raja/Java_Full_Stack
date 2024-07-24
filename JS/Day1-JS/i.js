

let scn = document.getElementById("scn");

let btn = document.getElementById("btn");

    btn.addEventListener("click",()=>
    {
        let num1 = parseInt(document.getElementById("num1").value);
        let num2 = parseInt(document.getElementById("num2").value);
        let op = document.getElementById("op").value;
        if(op=="+")
            scn.innerHTML=num1+num2;
        else if(op=="-")
            scn.innerHTML=num1-num2;
        else if(op=="*")
            scn.innerHTML=num1*num2;
        else if(op=="/")
            scn.innerHTML=num1/num2;
    })
  
    


