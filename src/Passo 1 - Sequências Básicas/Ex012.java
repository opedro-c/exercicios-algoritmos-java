import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o preço do produto: R$");
        double preco = sc.nextDouble();

        System.out.print("Informe a porcentagem do desconto (%): ");
        double desconto = sc.nextDouble();

        System.out.printf("Valor do produto com %.2f%% de desconto vale: R$%.2f\n", desconto, preco*(1 - desconto/100));

        sc.close();
    }
}
