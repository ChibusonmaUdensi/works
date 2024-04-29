const prompt = require("prompt-sync")();
let day = prompt ("What day is today? ")
switch(day.toLowerCase()){
  case "monday":
	console.log("Today is Monday");
	break;
  case "tuesday":
	console.log("Today is Tuesday");
	break;
  case "wednesday":
	console.log("Today is Wednesday");
	break;
  case "thursday":
	console.log("Today is Thursday");
	break;

  case "friday":
	console.log("Today is Friday");
	break;

  default:
	console.log("Any other day");
	
}

let login = false;
let message = login ? console.log("user sucessfully login") : console.log("failed to login")