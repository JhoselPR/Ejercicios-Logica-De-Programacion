let n = parseFloat(prompt('Ingresa un número'));
while (isNaN(n)){
    n = parseFloat(prompt('Error, por favor ingresa un número'));
}

const fibonacci = (n) => {
    let a = 0;
    let b = 1;
    let fib = '0';
    for (let i=1; i<n; i++){
        let sum = a+b;
        a = b;
        b = sum;
        fib += `, ${a}`;
    }
    return fib;
}

console.log(fibonacci(n));