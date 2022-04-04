function square(x) {
	return x*x;
}
function double(x) {
	return 2*x;
}
function composedValue(square, double) {
	return (square(double(5)));
}
console.log(composedValue);