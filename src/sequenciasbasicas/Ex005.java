package sequenciasbasicas;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, media;

        System.out.print("Nota 1: ");
        n1 = sc.nextFloat();

        System.out.print("Nota 2: ");
        n2 = sc.nextFloat();

        media = (n1 + n2) / 2;

        System.out.printf("Média do aluno: %.2f\n", media);

        sc.close();
    }
}
