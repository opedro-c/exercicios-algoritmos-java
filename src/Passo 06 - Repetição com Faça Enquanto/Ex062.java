import java.util.Scanner;

public class Ex062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;
        int idade, somaIdades = 0, numIdades = 0, numMaiores20 = 0;
        float mediaIdades;

        do {
            System.out.print("Digite a idade: ");
            idade = sc.nextInt();
            somaIdades += idade;
            numIdades++;
            numMaiores20 += (idade > 20) ? 1 : 0;
            System.out.print("Deseja continuar? [S/N] ");
            continuar = sc.next().toUpperCase().charAt(0);
        } while (continuar == 'S');

        mediaIdades = somaIdades / (float) (numIdades);

        System.out.printf(
            "Idades digitadas: %d\n" +
            "Média das idades digitadas: %.2f\n" +
            "Número de pessoas maiores de 21 anos: %d\n",
            numIdades, mediaIdades, numMaiores20
        );

        sc.close();
    }
}
