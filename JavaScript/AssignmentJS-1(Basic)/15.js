const cumulativeSum = (sum => value => sum += value)(0);

document.write([2 , 4 , 5 , 6 , 3 , 6].map(cumulativeSum));