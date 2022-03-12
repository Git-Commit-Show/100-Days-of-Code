class Example {
    static Callme() {
        console.log("Static method");
    }
}
Example.Callme();

class People {
    constructor(name) {
        this.name = name;
    }
    getName() {
        return this.name;
    }
    setName(name) {
        this.name = name;
    }
}
let person = new People("Jon Snow");
console.log(person.getName());
person.setName("Dany");
console.log(person.getName());

class People2 {
    constructor(name) {
        this.name = name;
    }
    get Name() {
        return this.name;
    }
    set Name(name) {
        this.name = name;
    }
}

let person2 = new People2("Jon Snow");
console.log(person2.Name);
person2.Name = "Dany";
console.log(person2.Name);