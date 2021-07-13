import java.util.Scanner;

/*
Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura “para”. No final, mostre na tela:
    a) Quantas mulheres foram cadastradas
    b) Quantos homens pesam mais de 100Kg
    c) A média de peso entre as mulheres
    d) O maior peso entre os homens
*/

public class Ex068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char sexo;
        int numMulheres = 0, numHomensPesoMais100 = 0;
        float peso, somaPesoMulheres = 0, mediaPesoMulheres, maiorPesoHomens = 0;

        for (int i = 1; i <= 8; i++) {
            System.out.printf("Digite o sexo da %dª pessoa [M/F]: ", i);
            sexo = sc.next().toUpperCase().charAt(0);
            System.out.printf("Digite a peso da %dª pessoa (Kg): ", i);
            peso = sc.nextFloat();

            numHomensPesoMais100 += (sexo == 'M' && peso > 100) ? 1 : 0;

            if (sexo == 'M' && peso > maiorPesoHomens)
                maiorPesoHomens = peso;
            if (sexo == 'F'){
                somaPesoMulheres += peso;
                numMulheres += 1;
            }
        }

            mediaPesoMulheres = somaPesoMulheres / (float) (numMulheres);

            System.out.printf(
                "Mulheres cadastradas: %d\n" +
                "Número de homens com peso maior que 100kg: %d\n" +
                "Média de peso das mulheres: %.2f\n" +
                "Maior peso entre os homens: %.2fkg\n",
                numMulheres, numHomensPesoMais100, 
                mediaPesoMulheres, maiorPesoHomens
            );

            sc.close();
    }
}
