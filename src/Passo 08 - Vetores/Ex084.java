import java.util.Scanner;

public class Ex084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] idades = new int[9];
        String[] nomes = new String[9];

        for (int i = 0; i < 9; i++) {
            System.out.printf("Digite o nome da %dª pessoa: ", i + 1);
            nomes[i] = sc.nextLine();
            System.out.printf("Digite a idade da %dª pessoa: ", i + 1);
            idades[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Pessoas menores de idade cadastradas: ");
        for (int i = 0; i < 9; i++) {
            if (idades[i] < 18) {
                System.out.printf("Nome: %s\nIdade: %d\n", nomes[i], idades[i]);
                System.out.println("------------------------------");
            }
        }
        
        sc.close();
    }
}
