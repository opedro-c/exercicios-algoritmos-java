import java.util.Scanner;

public class Ex020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("Esse número é par!");
        else
            System.out.println("Esse número é ímpar!");
        
        sc.close();
    }
}
