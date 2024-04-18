package controller;
public class OperacaoController {
    public int operacaoValor(int n) throws ArithmeticException {
        if (n < 0) {
            throw new ArithmeticException("O n�mero n�o pode ser negativo.");
        }

        if (n % 2 == 0) {
            return n * n; 
        } else {
            return n * n * n;
        }
    }

    
}