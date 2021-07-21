import java.util.Scanner;

public class Ex052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, somaIdades = 0, maiorIdade = 0, maiores18 = 0, menores5 = 0, cont = 0;
        
        while (cont < 10) {
            System.out.printf("Informe a %dª idade: ", cont+1);
            idade = sc.nextInt();
            if (cont == 0)
                maiorIdade = idade;
            else if (idade > maiorIdade)
                maiorIdade = idade;
            if (idade > 18)
                maiores18 += 1;
            else if (idade < 5)
                menores5 += 1;
            somaIdades += idade;
            cont++;
        }

        System.out.printf(
            "Média de idade: %.2f\n" +
            "Pessoas com mais de 18 anos: %d\n" +
            "Pessoas com menos de 5 anos: %d\n" +
            "Maior idade digitada: %d\n",
            somaIdades/10.0, maiores18, menores5, maiorIdade
        );

        sc.close();
    }
}
