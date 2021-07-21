import java.util.Scanner;

public class Ex097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Informe o primeiro valor: ");
        a = sc.nextInt();
        System.out.print("Informe o segundo valor: ");
        b = sc.nextInt();
        System.out.println("O maior valor é " + maior(a , b));
        

        sc.close();
    }

    private static int maior(int a, int b) {
        return (a > b) ? a : b;
    }
}
