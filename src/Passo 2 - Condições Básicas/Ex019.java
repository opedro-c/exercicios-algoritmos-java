import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String situacao;
        float n1, n2, media;

        System.out.print("Informe a nota 1 do aluno: ");
        n1 = sc.nextFloat();
        System.out.print("Infome a nota 2 do aluno: ");
        n2 = sc.nextFloat();

        media = (n1 + n2) / 2;
        situacao = (media >= 7) ? "Aprovado" : "Reprovado";

        System.out.printf("Média do aluno: %.2f\nSituação: %s\n", media, situacao);

        sc.close();
    }
}
