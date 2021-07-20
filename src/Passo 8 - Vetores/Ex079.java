import java.util.Scanner;

public class Ex079 {
    public static void main(String[] args) {
        int vet[] = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vet.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vet[i] = sc.nextInt();
        }

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) 
                System.out.printf("Posição: %d / Número: %d\n", i + 1, vet[i]);
        }

        sc.close();
    }
}
