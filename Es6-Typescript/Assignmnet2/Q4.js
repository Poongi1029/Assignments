"use strict";
class User {
    constructor(name, message) {
        this.name = name;
        this.message = message;
    }
}
let msgUser1 = new Map();
msgUser1.set("message1", "This is the message 1");
msgUser1.set("message2", "This is the message 2");
let user1 = new User("Alpha", msgUser1);
let msgUser2 = new Map();
msgUser2.set("message1", "This is the message 1");
msgUser2.set("message2", "This is the message 2");
let user2 = new User("Bravo", msgUser2);
let msgUser3 = new Map();
msgUser3.set("message1", "This is the message 1");
msgUser3.set("message2", "This is the message 2");
let user3 = new User("Chralie", msgUser3);
let msgUser4 = new Map();
msgUser4.set("message1", "This is the message 1");
msgUser4.set("message2", "This is the message 2");
let user4 = new User("Delta", msgUser4);
let msgUser5 = new Map();
msgUser5.set("message1", "This is the message 1");
msgUser5.set("message2", "This is the message 2");
let user5 = new User("Echo", msgUser5);
let msgUser6 = new Map();
msgUser6.set("message1", "This is the message 1");
msgUser6.set("message2", "This is the message 2");
let user6 = new User("Foxtrot", msgUser6);
let usersSet = new Set();
let usersSet2 = new Set();
usersSet.add(user1);
usersSet.add(user2);
usersSet.add(user3);
function addUserRoom2(user) {
    if (!usersSet.has(user) && usersSet2.size < 3) {
        usersSet2.add(user);
    }
}
addUserRoom2(user4);
addUserRoom2(user5);
addUserRoom2(user1);
addUserRoom2(user6);
let chatroom = new Map();
chatroom.set("chatroom1", usersSet);
chatroom.set("chatroom2", usersSet2);
console.log(chatroom);
