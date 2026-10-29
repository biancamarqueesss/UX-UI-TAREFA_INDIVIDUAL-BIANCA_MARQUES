package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.calcular(2, 3, "+"));   // esperado: 5
        System.out.println(calc.calcular(10, 4, "-"));  // esperado: 6
        System.out.println(calc.calcular(3, 5, "*"));   // esperado: 15
        System.out.println(calc.calcular(8, 2, "/"));   // esperado: 4

        try {
            System.out.println(calc.calcular(8, 0, "/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calcular(5, 5, "x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
