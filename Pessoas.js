class Person {
    constructor(firstName, lastName, age, gender, interest){
        this.name = `${firstName} ${lastName}`;
        this.age = age;
        this.gender = gender;
        this.interest = interest;
    }
    bio () {
        return (`${this.name} is ${this.age} years old. They like ${this.interest}.`);
    }
    greeting () {
        return (`Hi! I'm ${this.name}`);
    }
}

const pessoa = new Person('carlos', 'mesquita', 19, 'masculino', ['jogos', 'dinheiro']);
console.log(pessoa);
console.log(pessoa.bio());
console.log(pessoa.greeting());

class Teacher extends Person {
    constructor(firstName, lastName, age, gender, interest, subject) {
        super(firstName, lastName, age, gender, interest);
        this.subject = subject;
    }

    teacherSubject () {
        return (this.subject);
    }
    greeting () {
        return (`Hello. My name is ${this.name}, and I teach ${this.subject}.`);
    }
}

const professor = new Teacher('carlos', 'mesquita', 19, 'masculino', ['jogos','dinheiro'],'portugues');
console.log(professor);
console.log(professor.teacherSubject());
console.log(professor.greeting());

class Student extends Person {
    constructor(firstName, lastName, age, gender, interest) {
        super(firstName, lastName, age, gender, interest);
        this.firstName = firstName;
    }
    greeting () {
        return (`Yo! I'm ${this.firstName}`);
    }
}

const estudante = new Student('carlos', 'mesquita', 19, 'masculino', ['jogos','dinheiro'],'portugues');
console.log(estudante);
console.log(estudante.greeting());