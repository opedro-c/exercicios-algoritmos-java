import java.util.Scanner;

public class Ex081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] idades = new int[8];
        int maiorIdade = 0, somaIdades = 0;
        float mediaIdades;

        for (int i = 0; i < idades.length; i++) {
            System.out.printf("Digite a %dª idade: ", i + 1);
            idades[i] = sc.nextInt();
            somaIdades += idades[i];

            if (i == 0)
                maiorIdade = idades[i];
            else if (idades[i] > maiorIdade)
                maiorIdade = idades[i];
        }
        
        mediaIdades = somaIdades / (float) (idades.length);
        System.out.printf(
            "Média das idades: %.2f\n" +
            "Maior idade: %d\n" +
            "Posições em que a maior idade aparece na lista: ",
            mediaIdades, maiorIdade
        );
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] == maiorIdade)
                System.out.printf("%d ", i + 1);
        }

        sc.close();
    }
}
