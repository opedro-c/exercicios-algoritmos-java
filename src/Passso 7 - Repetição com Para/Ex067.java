import java.util.Scanner;

public class Ex067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um valor: ");
        num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }

        System.out.println("FIM");

        sc.close();
    }
}
