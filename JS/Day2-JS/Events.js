const btnclick = document.querySelector(".btnclick");
const btnchange = document.querySelector(".btnchange");
const btnfocus = document.querySelector(".btnfocus");
const btnblur = document.querySelector(".btnblur");

btnclick.addEventListener("click", () => {
  alert("button clicked");
});

btnchange.addEventListener("change", () => {
  btnchange.style.backgroundColor = "red";
});


  
