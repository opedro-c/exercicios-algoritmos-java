import java.util.Scanner;

public class Ex053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char sexo;
        int cont = 0, idade, numHomens = 0, numMulheres = 0, 
            somaIdadeGrupo = 0, somaIdadeHomens = 0, mulheresMaiores20 = 0;

        while (cont < 6) {
            System.out.printf("Informe idade da %dª pessoa: ", cont+1);
            idade = sc.nextInt();
            System.out.print("Informe o sexo: ");
            sexo = sc.next().charAt(0);

            if (sexo == 'M') {
                numHomens++;
                somaIdadeHomens += idade;
            }
            else if (sexo == 'F') {
                if (idade > 20)
                    mulheresMaiores20 += 1;
                numMulheres++;
            }
            
            somaIdadeGrupo += idade;
            cont++;
        }

        System.out.printf(
            "Número de homens cadastrados: %d\n" +
            "Número de mulheres cadastradas: %d\n" +
            "Média de idade do grupo: %.2f\n" +
            "Média de idade dos homens: %.2f" +
            "Mulheres maiores de 20 anos de idade: %d",
            numHomens, numMulheres, 
            somaIdadeGrupo/5.0f, somaIdadeHomens/ (float) (numHomens),
            mulheresMaiores20
        );

        sc.close();
    }
}
