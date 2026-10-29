package calculadora;

/**
 * <p>Classe de teste da {@link Calculadora}.</p>
 *
 * <p>Executa as quatro operações básicas e verifica os dois casos de erro
 * (divisão por zero e operador inválido), que lançam {@link IllegalArgumentException}.
 * As exceções são capturadas para que a execução do programa não seja interrompida.</p>
 *
 * @author Bianca França Marques
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * Executa os testes e imprime os resultados no console.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Operações válidas: o resultado esperado está indicado ao lado de cada chamada
        System.out.println(calc.calcular(2, 3, "+"));   // esperado: 5
        System.out.println(calc.calcular(10, 4, "-"));  // esperado: 6
        System.out.println(calc.calcular(3, 5, "*"));   // esperado: 15
        System.out.println(calc.calcular(8, 2, "/"));   // esperado: 4

        // Divisão por zero: deve lançar exceção, tratada com try/catch
        try {
            System.out.println(calc.calcular(8, 0, "/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Operador inválido: deve lançar exceção, tratada com try/catch
        try {
            System.out.println(calc.calcular(5, 5, "x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
