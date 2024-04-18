package controller;


public class Teste {
	public static void main(String[] args) {
        OperacaoController controller = new OperacaoController();

        try {
            int test = controller.operacaoValor(4);
            System.out.println("test:" + test);

        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
