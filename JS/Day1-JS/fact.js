let num=document.getElementById("num")


const btn=document.getElementById("btn")
const scn=document.getElementById("scn")
btn.addEventListener("click",()=>
{ 
    let f=1;
    for( i=1;i<=num.value;i++)
    {
       f=f*i;
    }
    scn.innerHTML=f;
})