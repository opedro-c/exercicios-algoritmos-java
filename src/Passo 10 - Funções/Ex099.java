import java.util.Scanner;

public class Ex099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        layout();
        System.out.print("Informe a base da potenciação: ");
        a = sc.nextInt();
        System.out.print("Informe a potência: ");
        b = sc.nextInt();

        System.out.print("Resultado: " + potencia(a, b));

        sc.close();
    }

    private static int potencia(int a, int b) {
        int resultado = 1;
        for (int i = 0; i < b; i ++)
            resultado *= a;
        return resultado;
    }

    private static void layout() {
        System.out.println("===Calculadora de Potência===");
    }
}
