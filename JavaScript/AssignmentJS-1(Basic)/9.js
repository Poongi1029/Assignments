var string = prompt("Welcome to Guessing Game\nEnter Go to Start Game");
var num = Math.floor(Math.random()*10)+1;
var i = 0;
var array = [];
if(string == "Go"){
    while( i != 1){
        var num1 = prompt("Guess a number between 0 to 10");
        if(!array.includes(num1)){
            array.push(num1);            
        }
        if(num1 == num){
            i=1;
            document.write("Your guess was correct, Number of tries are "+array.length);
        }
        
    }
    
}