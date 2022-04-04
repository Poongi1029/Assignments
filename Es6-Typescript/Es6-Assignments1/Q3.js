"use strict";
let Order = {
    id: 11,
    title: "Pizza",
    cost: "200 Rs",
    printOrder() {
        console.log(" id is:" + Order.id + " , " +
            "Order:" + Order.title + " ," +
            "Cost is:" + Order.cost);
    },
    getPrice() {
        console.log("Price is:" + Order.cost);
    }
};
let Order1 = Object.assign(Order);
console.log(Order1);
console.log(Order1.printOrder());
console.log(Order1.getPrice());
