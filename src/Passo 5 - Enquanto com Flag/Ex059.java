import java.util.Scanner;


public class Ex059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char sexo, continuar = 'S';
        int idade, maiorIdade = -1, 
            numHomensCadastrados = 0, 
            idadeMulherMaisJovem = 999;
        float mediaIdadeHomens, 
            somaIdadeHomens = 0;

        while (continuar == 'S') {
            System.out.print("Informe o sexo [M/F]: ");
            sexo = sc.next().toUpperCase().charAt(0);
            System.out.print("Informe a idade: ");
            idade = sc.nextInt();

            if (idade > maiorIdade)
                maiorIdade = idade;
            if (sexo == 'F' && idade < idadeMulherMaisJovem)
                idadeMulherMaisJovem = idade;
            numHomensCadastrados += (sexo == 'M') ? 1 : 0;
            somaIdadeHomens += (sexo == 'M') ? idade : 0;

            System.out.print("Deseja continuar cadastrando? [S/N] ");
            continuar = sc.next().toUpperCase().charAt(0);
        }

        mediaIdadeHomens = somaIdadeHomens / (float) (numHomensCadastrados);

        System.out.printf(
            "Maior idade lida: %d\n" +
            "Número de homens cadastrados: %d\n" +
            "Idade da mulher mais jovem: %d\n" +
            "Média de idade entre os homens: %.2f\n",
            maiorIdade, numHomensCadastrados, 
            idadeMulherMaisJovem, mediaIdadeHomens
        );

        sc.close();
    }
}
