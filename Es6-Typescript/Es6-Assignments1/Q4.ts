let names = ['Tom ', 'Ivan ', 'Jerry '];  // Array of string
        console.log(names) 

        let lengths = names.map(name => name.length); // Array of each String variable length
        console.log(lengths);
    
       const newArray = names.map((str) => ({ name: str, length: str.length })) // new array of objects having two properties name and length 
       console.log(newArray);