
let dis = document.querySelector(".dis");
let btn = document.querySelector(".btn");

btn.addEventListener("click", () => {
    let strr = document.querySelector(".func").value;
    dis.innerHTML+="<br><br>"
    dis.innerHTML+="<b>str.trim() trims the empty spaces:</b> "+strr.trim()+"<br><br>"
    dis.innerHTML+="<b>str.trimStart() trims the empty spaces only at start:</b> "+strr.trimStart()+"<br><br>"
    dis.innerHTML+="<b>str.trimEnd() trims the empty spaces only at end: </b>"+strr.trimEnd()+"<br><br>"
    dis.innerHTML+="<b>str.length gives the length of the string: </b>"+strr.length+"<br><br>"
    dis.innerHTML+="<b>str.charAt() returns the character at the particular index: </b>"+strr.charAt(0)+"<br><br>"
    dis.innerHTML+="<b>str.slice(start,end) slice the string within that interval: </b>"+strr.slice(0,3)+"<br><br>"
    dis.innerHTML+="<b>str.substring(start,end) returns the substring within that interval: </b>"+strr.substring(0,4)+"<br><br>"
    dis.innerHTML+="<b>str.sunstr(start,length) returns the substring within that particular length: </b>"+strr.substr(0,4)+"<br><br>"
    dis.innerHTML+="<b>str.toUpperCase() converts the string to Uppercase: </b>"+strr.toUpperCase()+"<br><br>"
    dis.innerHTML+="<b>str.toLowerCase() converts the string to Lowercase: </b>"+strr.toLowerCase()+"<br><br>"
    dis.innerHTML+="<b>str.concat(strr) Concats the string: </b>"+strr.concat(strr)+"<br><br>"
    dis.innerHTML+="<b>str.replace('a,'#') Replaces the first character in string: </b>"+strr.replace("a","#")+"<br><br>"
    dis.innerHTML+="<b>str.replaceAll('a,'#') Replaces all the character in string: </b>"+strr.replaceAll("a","@")+"<br><br>"
    dis.innerHTML+="<b>str.repeat(4) Repeats  the String for n times: </b>"+strr.repeat(4)+"<br><br>"
    dis.innerHTML+="<b>str.split('@') Splits  the String based on certain condition: </b>"+strr.split("@")+"<br><br>"
 
});
