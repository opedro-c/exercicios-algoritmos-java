package sequenciasbasicas;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        float num = sc.nextFloat();

        System.out.printf(
            "O dobro de %.2f é %.2f\n" +
            "Já a terça parte de %.2f é %.2f\n",
            num, num * 2, num, num / 3.0
        );

        sc.close();
    }
}
