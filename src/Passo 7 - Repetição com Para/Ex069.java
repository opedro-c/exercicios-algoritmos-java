import java.util.Scanner;

public class Ex069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1, r, soma = 0, termo;
        System.out.print("Informe o primeiro termo da P.A: ");
        a1 = sc.nextInt();
        System.out.print("Informe a razão da P.A: ");
        r = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            termo = a1 + r * (i - 1);
            System.out.printf("%d ", termo);
            soma += termo;
        }
        System.out.println("\nA soma dos 10 primeiros termos dessa progressão vale: " + soma);

        sc.close();
    }
}
