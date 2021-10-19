let nomes = [ 
    { name: "Angelina Jolie", age: 80 }, 
    { name: "Eric Jones", age: 2 }, 
    { name: "Paris Hilton", age: 5 }, 
    { name: "Kayne West", age: 16 }, 
    { name: "Bob Ziroll", age: 100 } 
]
console.log(nomes
    .map(element => element.age >= 18 ? `${element.name} pode assistr The Matrix` : `${element.name} não pode assistir The Matrix`)
)