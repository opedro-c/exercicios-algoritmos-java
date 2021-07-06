package sequenciasbasicas;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valor;

        System.out.print("Informe o valor: R$");
        valor = sc.nextFloat();

        System.out.printf("Você pode comprar: U$%.2f\n", valor/5,14);

        sc.close();
    }
}
