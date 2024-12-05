let secretNum = 40;
const arr = [];

const isNumber = (n) => {
    while (isNaN(n)) {
        n = parseInt(prompt('Error, por favor ingresa un número'));
    }
    return n;
}
let n = parseInt(prompt('Ingresa un número del 1 al 100 para adivinar un número secreto'));
n = isNumber(n);

while (n != secretNum) {
    arr.push(n);
    console.log('Ups, el número secreto es incorrecto, vuelve a intentarlo');
    n = parseInt(prompt('Ingresa un número del 1 al 100 para adivinar un número secreto'));
    n = isNumber(n);
}
if (n == secretNum) console.log('Felicidades, adivinaste el número secreto: ' + n);
if (arr.length >= 1) console.log(`Números introducidos antes de adivinar el número secreto: ${arr}`);