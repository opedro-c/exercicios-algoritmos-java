import java.util.Scanner;

public class Ex078 {
    public static void main(String[] args) {
        int vet[] = new int[15];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vet.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vet[i] = sc.nextInt();
        }

        System.out.print("Números digitados: ");
        for (int i = 0; i < vet.length; i++)
            System.out.printf("%d ", vet[i]);

        System.out.print("Posição dos números múltiplos de 10: ");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 10 == 0 && vet[i] != 0)
                System.out.printf("%d ", i + 1);
        }

        sc.close();
    }
}
