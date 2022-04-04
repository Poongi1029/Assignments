//a)With Default Values
const add=(a=10,b=20)=>
{
    console.log(a,b);
}
console.log(add());


/*b)Write a function userFriends() 
that takes 2 arguments username & array of user friends. 
The function should print username & his list of friends. 
(Use rest parameters)*/

const userFriends=(username: string, ...Hello: string[])=>
    {
        console.log(Hello); 
        console.log(username);
        for(let i in Hello)
        {
            console.log("List of friends poo have:"+ Hello[i]);
        }

    }
let username="userName is:poo";
userFriends(username,"poo","iman","devi","ashok");


/*c.Write a function printCapitalNames() 
that takes five names as argument & prints them in capital letters.
 Use spread operator in order to call printCapitalNames() function.*/

 const printCapitalNames=()=>
 {
    for(let i in Names)
    {
        console.log("Small list is:"+Names[i]);
        let a=Names[i].toLocaleUpperCase();
        console.log("Capital Listis:"+a);
    }
 }
 let Names=['poo','iman','ashok','devi','Picky'];
 printCapitalNames(...Names);




