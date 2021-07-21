import java.util.Random;
import java.util.Scanner;

public class Ex80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] vet = new int[30];
        int num,quantasVezesAparece = 0;

        for (int i = 0; i < vet.length; i++)
            vet[i] = random.nextInt(15) + 1;
        
        System.out.print("Digite um número de 1 a 15: ");
        num = sc.nextInt();

        System.out.print("Números sorteados: ");
        for (int i = 0; i < vet.length; i++)
            System.out.printf(" %d", vet[i]);
        
        System.out.print("\nPosições da chave: ");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == num) {
                System.out.printf(" %d", i);
                quantasVezesAparece++;
            }
        }
        System.out.print("\nNúmero de aparições da chave: " + quantasVezesAparece + "\n");

        sc.close();
    }
}
