let calculadora = (() => {
    let listaOperacoes = [];
    let numeroHistorico = [];
    let operacaoHistorico = [];
    let resultadoOperacoes = [];

    const ultitimoTermo = (lista) => {
        return lista[lista.length - 1]
    }

    const penultitimoTermo = (lista) => {
        return lista[lista.length - 2]
    }

    const enter = (entrada) => {
        if (typeof entrada === "number") {
            numeroHistorico.push(entrada);
        } else if (typeof entrada === "string") {
            operacaoHistorico.push(entrada);
        }
    }

   const equals = () => {
        let calculo; 
        if (numeroHistorico.length % 2 !== 0) {// caso coloquem duas operações ao invés de dois números, o calculo resultará em null
            numeroHistorico.push(0);
            calculo = null;
        } else {
            if (ultitimoTermo(operacaoHistorico) === '+') {
                calculo = penultitimoTermo(numeroHistorico) + ultitimoTermo(numeroHistorico); 
            }
            if (ultitimoTermo(operacaoHistorico) === '-') {
                calculo = penultitimoTermo(numeroHistorico) - ultitimoTermo(numeroHistorico); 
            }
            if (ultitimoTermo(operacaoHistorico) === '*') {
                calculo = penultitimoTermo(numeroHistorico) * ultitimoTermo(numeroHistorico); 
            }
            if (ultitimoTermo(operacaoHistorico) === '/') {
                if (penultitimoTermo(numeroHistorico) === 0 || ultitimoTermo(operacaoHistorico) === 0) { //qualquer divisão por zero gerá resultado igual a 0
                    calculo = 0;
                } else {
                    calculo = penultitimoTermo(numeroHistorico) / ultitimoTermo(numeroHistorico); 
                }
            }  
        }
        resultadoOperacoes.push(calculo);
        console.log(calculo);
    }

    const list = () => {
        console.log(listaOperacoes = [...listaOperacoes, `${penultitimoTermo(numeroHistorico)} ${ultitimoTermo(operacaoHistorico)} ${ultitimoTermo(numeroHistorico)} => ${ultitimoTermo(resultadoOperacoes)}`])
    }

    const reset = () => {
        listaOperacoes = [];
        numeroHistorico = [];
        operacaoHistorico = [];
        resultadoOperacoes = [];
        console.log(listaOperacoes);
    }
    
    return {
        enter,
        equals,
        list,
        reset
    }
})()

calculadora.enter(2);
calculadora.enter('*');
calculadora.enter(3);
calculadora.equals();
calculadora.list();
calculadora.enter(1);
calculadora.enter('+');
calculadora.enter(3);
calculadora.equals();
calculadora.list();
calculadora.enter(0);
calculadora.enter('/');
calculadora.enter(0);
calculadora.equals();
calculadora.list();
calculadora.reset();
calculadora.enter(18);
calculadora.enter('/');
calculadora.enter(9);
calculadora.equals();
calculadora.list();
calculadora.enter(3);
calculadora.enter('-');
calculadora.enter(4);
calculadora.equals();
calculadora.list();
calculadora.reset();
calculadora.enter(10);
calculadora.enter('-');
calculadora.enter(5.4);
calculadora.equals();
calculadora.list();
calculadora.enter(10);
calculadora.enter('-');
calculadora.enter('+');
calculadora.equals();
calculadora.list();
calculadora.enter(4);
calculadora.enter('*');
calculadora.enter(3);
calculadora.equals();
calculadora.list();