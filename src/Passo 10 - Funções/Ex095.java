import java.util.Scanner;

public class Ex095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();
        System.out.println("A soma dos valores digitados valem: " + somador(n1, n2));
        sc.close();
    }

    private static int somador(int n1, int n2) {
        return n1 + n2;
    }
}
