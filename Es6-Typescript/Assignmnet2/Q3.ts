let lowNumber2 = 9;
function armstrong2() {
  for (let i = lowNumber2; i > 0; i++) {
    let numberOfDigits = i.toString().length;
    let sum = 0;
    let temp = i.toString();
    for (let char of temp) {
      sum += Math.pow(parseInt(char), numberOfDigits);
    }
    if (sum == i) {
      console.log(i);
      lowNumber2 = i;
      break;
    }
  }
}
function getNextArmstrong2() {
  lowNumber2++;
  armstrong2();
}
function reset() {
  lowNumber2 = 9;
}


armstrong2();
getNextArmstrong2();
getNextArmstrong2();
getNextArmstrong2();
reset();
armstrong2();
getNextArmstrong2();
getNextArmstrong2();
getNextArmstrong2();