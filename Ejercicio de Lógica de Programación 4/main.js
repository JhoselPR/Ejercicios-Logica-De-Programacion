let n = parseFloat(prompt('Ingresa un número'));
while (isNaN(n)){
    n = parseFloat(prompt('Error, por favor ingresa un número'));
}

const fibonacci = (n) => {
    let a = 0;
    let b = 1;
    let fib = '0, 1';
    for (let i=0; i<(n-2); i++){
        let sum = a+b;
        fib += `, ${sum}`;
        a = b;
        b = sum;
    }
    return fib;
}

console.log(fibonacci(n));