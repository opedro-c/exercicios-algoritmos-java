import java.util.Scanner;

public class Ex066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("================");
        System.out.println("     TABUADA    ");
        System.out.println("================");
        System.out.print("Digite um número pra ver sua tabuada: ");
        num = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %2d = %d\n", num, i, num * i);
        }

        sc.close();
    }
}
