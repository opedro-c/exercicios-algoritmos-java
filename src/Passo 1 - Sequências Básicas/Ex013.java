import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, aumento;

        System.out.print("Informe o salário: R$");
        salario = sc.nextDouble();

        System.out.print("Informe o aumento (%): ");
        aumento = sc.nextDouble();

        System.out.println("Novo salário: R$" + salario * (1 + aumento/100));

        sc.close();
    }
}
