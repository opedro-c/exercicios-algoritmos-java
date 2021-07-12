import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta;

        System.out.println("------------------------");
        System.out.println("  CALCULADORA DE DELTA  ");
        System.out.println("------------------------");
        System.out.println("    ax² * bx * c = 0    ");
        System.out.println("Informe o valor de a: ");
        a = sc.nextDouble();
        System.out.println("Informe o valor de b: ");
        b = sc.nextDouble();
        System.out.println("Informe o valor de c: ");
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4*a*c;

        System.out.println("Valor do delta --> " + delta);

        sc.close();
    }
}
