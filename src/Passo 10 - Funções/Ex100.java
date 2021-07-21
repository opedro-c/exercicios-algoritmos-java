import java.util.Scanner;

public class Ex100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, media;

        System.out.print("Digite a primeira nota do aluno: ");
        n1 = sc.nextFloat();
        System.out.print("Digite a segunda nota do aluno: ");
        n2 = sc.nextFloat();

        media = media(n1, n2);

        System.out.println("A média do aluno é " + media);
        System.out.println("Sitação: " + situacao(media));

        sc.close();
    }

    private static float media(float n1, float n2) {
        return (n1 + n2) / 2.0f;
    }

    private static String situacao(float media) {
        return (media >= 7.0f) ? "Aprovado" : "Reprovado";
    }
}
