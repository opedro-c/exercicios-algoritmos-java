import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();

        System.out.printf(
                "O antecessor de %d é %d\n" +
                "Já o sucessor de %d vale %d",
                num, num - 1, num, num + 1
        );
        sc.close();
    }
}
