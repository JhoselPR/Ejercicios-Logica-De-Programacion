let n = parseFloat(prompt('Ingresa un número'));
while (isNaN(n)){
    n = parseFloat(prompt('Error, por favor ingresa un número'));
}

const factorial = (n) => {
    if (n==1){
        return 1;
    }else{
        return n * factorial(n-1);
    }
}

if (n>=1){
    console.log(`${n}! = ${factorial(n)}`);
}else if (n==0){
    console.log(`${n}! = 1`);
}else{
    console.log('Número inválido');
}