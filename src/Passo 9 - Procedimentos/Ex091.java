import java.util.Scanner;

public class Ex091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Informe o primeiro valor: ");
        a = sc.nextInt();
        System.out.print("Informe o segundo valor: ");
        b = sc.nextInt();
        System.out.print("O maior valor é ");
        maior(a , b);

        sc.close();
    }

    public static void maior(int a, int b) {
        int maior;

        if (a > b)
            maior = a;
        else if (b > a)
            maior = b;
        else {
            System.out.println("Valores são iguais");
            return;
        }
        System.out.println(maior);
    }
}
