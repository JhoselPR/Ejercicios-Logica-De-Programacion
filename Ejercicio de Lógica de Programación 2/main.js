let tempC = parseFloat(prompt('Ingresa la temperatura en grados Celcius'));
while (isNaN(tempC)){
    tempC = parseFloat(prompt('Error, por favor ingresa un número'));
}

const tempToFahr = (tempC) => {
    return (tempC*1.8)+32;
}
const tempToK = (tempC) => {
    return tempC + 273.15;
}

console.log(`Grados Fahrenheit: ${tempToFahr(tempC)}\nGrados Kelvin: ${tempToK(tempC)}`);