import java.util.Scanner;

public class Ex060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, 
            nomePessoaMaisVelha = "",
            nomeMulherMaisJovem = "";
        int idade, somaDasIdades = 0, maiorIdade = -1,
            idadeMulherMaisJovem = 999, numHomensMais30 = 0,
            numMulheresMenos18 = 0, numPessoasCadastradas = 0;
        char sexo, continuar = 'S';
        float mediaIdades;

        while (continuar == 'S') {
            System.out.print("Informe o nome: ");
            nome = sc.nextLine();
            System.out.print("Informe a idade: ");
            idade = sc.nextInt();
            somaDasIdades += idade;
            System.out.print("Informe o sexo: ");
            sexo = sc.next().toUpperCase().charAt(0);
            numPessoasCadastradas += 1;

            if (idade > maiorIdade) {
                maiorIdade = idade;
                nomePessoaMaisVelha = nome;
            }
            if (sexo == 'F' && idade < idadeMulherMaisJovem) {
                idadeMulherMaisJovem = idade;
                nomeMulherMaisJovem = nome;
            }
            numHomensMais30 += (sexo == 'M' && idade > 30) ? 1 : 0;
            numMulheresMenos18 = (sexo == 'F' && idade < 18) ? 1 : 0;

            System.out.print("Deseja continuar cadastrando? [S/N] ");
            continuar = sc.next().toUpperCase().charAt(0);
        }

        mediaIdades = somaDasIdades / (float) (numPessoasCadastradas);

        System.out.printf(
            "Pessoa mais velha cadastrada: %s" +
            "Mulher mais jovem cadastrada: %s" +
            "Média de idade do grupo: %.2f" +
            "Número de homens maiores de 30: %d" +
            "Número de mulheres com menos de 18: %d",
            nomePessoaMaisVelha, nomeMulherMaisJovem,
            mediaIdades, numHomensMais30, numMulheresMenos18
        );

        sc.close();
    }
}
