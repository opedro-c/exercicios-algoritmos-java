import java.util.Scanner;

public class Ex092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Informe um número: ");
        num = sc.nextInt();

        System.out.print("O númer digitado é ");
        parOuImpar(num);

        sc.close();
    }

    public static void parOuImpar(int n) {
        if (n % 2 == 0)
            System.out.println("par");
        else
            System.out.println("ímpar");
    }
}
