const equals = (operador, numbers) => {
    if (operador === '+') {
        console.log('selecione a operacao')
        const soma = numbers.reduce(
            (somaAtual, current) => somaAtual + current,
            0
        )
        numbers = [];
        return soma         
    }

    if (operador === '-') {
        const sub = numbers.reduce(
            (somaAtual, current) => somaAtual - current,
        )
        numbers = [];
        console.log(sub);
    }

    if (operador === '*') {
        const multi = numbers.reduce(
            (somaAtual, current) => somaAtual * current,
            1
        )
        numbers = [];
        console.log(multi);   
    }

    if (operador === '/') {
        const div = numbers.reduce(
            (somaAtual, current) => somaAtual / current,
        )
        numbers = [];
        console.log(div);   
    }
}