alert("Ingresa tres números");
const arr = []
for (let i = 0; i < 3; i++) {
    arr[i] = parseInt(prompt("Ingresa un número:"));
}
sortedArr = arr.sort((a, b) => b - a);
console.log(sortedArr);
console.log(sortedArr.reverse());
if (arr.every(e => e === arr[0])) {
    console.log("Todos los números son iguales")
} else {
    console.log(`El número mayor es ${sortedArr[2]}\nEl número menor es ${sortedArr[0]}\nEl número de en medio es ${sortedArr[1]}`);
}

