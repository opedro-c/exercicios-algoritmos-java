import java.util.Scanner;

public class Ex026  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Informe o primeiro valor: ");
        a = sc.nextInt();
        System.out.print("Informe o segundo valor: ");
        b = sc.nextInt();

        if (a > b)
            System.out.println("O primeiro valor é maior");
        else if (a == b)
            System.out.println("Não existe valor maior");
        else
            System.out.println("O segundo valor é maior");
        
        sc.close();

    }
}