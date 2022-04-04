"use strict";
class MyClass {
    constructor(current) {
        this.previousNo = fibonacci(this.currentNo - 1);
        this.currentNo = this.currentNo;
    }
    next() {
        return fibonacci(this.currentNo + 1);
    }
}
var fibonacci = function (num) {
    var a = 0, b = 1, f = 1;
    for (var i = 2; i <= num; i++) {
        f = a + b;
        a = b;
        b = f;
    }
    return f;
};
let myClass = new MyClass(5);
console.log(myClass.next());
