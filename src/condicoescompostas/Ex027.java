package condicoescompostas;

import java.util.Scanner;

public class Ex027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, media;
        String situacao;

        System.out.print("Informe a nota 1: ");
        n1 = sc.nextFloat();
        System.out.print("Informe a nota 2: ");
        n2 = sc.nextFloat();

        media = (n1 + n2) / 2;

        if (media < 5)
            situacao = "Reprovado";
        else if (media < 7)
            situacao = "Recuperação";
        else
            situacao = "Aprovado";
        
        System.out.printf("Média: %.2f\nSituação: %s\n", media, situacao);

        sc.close();
    }    
}
