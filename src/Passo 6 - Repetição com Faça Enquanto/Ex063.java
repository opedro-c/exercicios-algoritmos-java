import java.util.Scanner;

public class Ex063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0, numPares = 0;
        float num, menorValor = 0, media, soma = 0;
        char continuar;

        do {
            System.out.print("Digite o valor: ");
            num = sc.nextInt();
            soma += num;
            
            if (cont == 0) {
                menorValor = num;
            }
            else if (num < menorValor)
                menorValor = num;
            cont++;

            numPares += (num % 2 == 0) ? 1 : 0;

            System.out.print("Deseja cotinuar? [S/N] ");
            continuar = sc.next().toUpperCase().charAt(0);
        } while(continuar == 'S');

        media = soma / (float) (cont);

        System.out.printf(
            "Soma dos valores: %f\n" +
            "Menor valor digitado: %f\n" +
            "Média dos valores digitados: %f\n" +
            "Quantidade de valores pares: %d\n",
            soma, menorValor, media, numPares
        );

        sc.close();
    }
}
