function getInputValue () {
    const input = document.querySelector('input');
    numberSelected = +input.value;
    numbers = [...numbers, numberSelected];
}

function clearInput () {
    const input = document.querySelector('input');
    input.value = '';
}

const equals = (operador, numbers) => {
    if (operador === '+') {
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
        return sub;
    }

    if (operador === '*') {
        const multi = numbers.reduce(
            (somaAtual, current) => somaAtual * current,
            1
        )
        numbers = [];
        return multi;   
    }

    if (operador === '/') {
        const div = numbers.reduce(
            (somaAtual, current) => somaAtual / current,
        )
        numbers = [];
        return div;   
    }
}