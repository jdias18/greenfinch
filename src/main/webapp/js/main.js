function OnlyCharAndNum(tfield) { 
   var valid = " ABCDEFGHIJKLMNOPQRSTUVXYZabcdefghijklmnopqrstuvwxyz0123456789"; 
   var ok = "yes"; 
   var field = document.getElementById(tfield).value;
   var temp; 
   for (var i=0; i<field.length; i++) { 
    temp = "" + field.substring(i, i+1); 
    if (valid.indexOf(temp) == "-1") ok = "no";
   } 
   if (ok == "no") { 
	   document.getElementById(tfield).value='';
	   alert("Invalid characters !");
	   document.getElementById(tfield).focus();
   }
}

function PasswordValidation(tfield){
	pwd = document.getElementById(tfield).value;
	if(pwd.lenght < 8){
		alert("Invalid Password ! You must have 8 caracters, Upper/Lower ans special caracters !@#$%^&*");
		document.getElementById('submit').focus();
	} else {
		var strongRegex = new RegExp("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*])(?=.{8,})");
		number = 0;
		if(!strongRegex.test(pwd)){
			document.getElementById(tfield).value='';
			alert("Invalid Password ! You must have 8 caracters, Upper/Lower ans special caracters !@#$%^&*");
			document.getElementById('submit').focus();
		}
	}
}