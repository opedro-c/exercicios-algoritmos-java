import java.util.Scanner;

public class Ex094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe quantos elementos da sequência de fibonacii deseja vizualizar: ");
        fibonacci(sc.nextInt());
        sc.close();
    }

    public static void fibonacci(int quantidade) {
        int n1 = 0, n2 = 1, aux;
        for (int i = 0; i < quantidade - 2; i++) {
            if (i == 0)
                System.out.printf("%d %d ", n1, n2);
            aux = n2;
            n2 = n1 + n2;
            n1 = aux;
            System.out.printf("%d ", n2);
        }
        System.out.println();
    }
}
