const a = 50;
// a = 60; //TypeError: Assignment to constant variable.

const b = "Constant variable";
// b = "Assigning new value"; //TypeError: Assignment to constant variable.

const LANGUAGES = ['Js', 'Ruby', 'Python', 'Go'];
// LANGUAGES = "Javascript"; //TypeError: Assignment to constant variable.

LANGUAGES.push('Java');
console.log(LANGUAGES);