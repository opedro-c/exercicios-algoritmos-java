import java.util.Scanner;

public class Ex098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, f;

        layout();
        System.out.print("Informe o primeiro número para o Super Somador: ");
        i = sc.nextInt();
        System.out.print("Informe em que número parar de somar: ");
        f = sc.nextInt();
        System.out.println("A soma de todos o valores entre os números informador vale: " + superSomador(i, f));

        sc.close();
    }

    private static int superSomador(int i, int f) {
        int soma = 0;
        for (int c = i; c <= f; c++) {
            soma += c;
        }
        return soma;
    }

    private static void layout() {
        System.out.println("===Super Somador===");
    }
}
