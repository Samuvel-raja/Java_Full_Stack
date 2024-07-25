let exp="";
const inp=document.querySelector(".inp");
console.log(inp);
const btn=document.querySelectorAll(".btn")

function press(val)
{
    exp+=val
    inp.value=exp

}
function clearFunc()
{
    inp.value='0'
    exp=''
}
function solve()
{
    inp.value=eval(exp)
    exp=eval(exp)
}
function deleteFunc()
{
    inp.value=inp.value.slice(0, -1);
    exp=inp.value
}