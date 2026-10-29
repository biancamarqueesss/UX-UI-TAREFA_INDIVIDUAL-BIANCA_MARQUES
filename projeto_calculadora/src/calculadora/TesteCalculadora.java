package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Testes rápidos
        testar(calc, "Soma", 2, 3, "+", 5);                    // esperado: 5
        testar(calc, "Subtração", 10, 4, "-", 6);              // esperado: 6
        testar(calc, "Multiplicação", 3, 5, "*", 15);          // esperado: 15
        testar(calc, "Divisão", 8, 2, "/", 4);                 // esperado: 4
        testar(calc, "Divisão por zero", 8, 0, "/", 0);        // divisao por zero
        testar(calc, "Operação inválida", 5, 5, "x", 0);       // operação inválida
    }

    // Executa um caso e mostra: entradas utilizadas, resultado esperado e resultado obtido.
    private static void testar(Calculadora calc, String nome, int a, int b, String op, int esperado) {
        System.out.println("--- " + nome + " ---");
        System.out.println("Entrada: a=" + a + ", b=" + b + ", op=\"" + op + "\"");
        int obtido = calc.calc(a, b, op);
        System.out.println("Esperado: " + esperado + " | Obtido: " + obtido
                + " -> " + (obtido == esperado ? "PASSOU" : "FALHOU"));
        System.out.println();
    }
}
