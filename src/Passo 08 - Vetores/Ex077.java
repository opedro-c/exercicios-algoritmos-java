import java.util.Scanner;

public class Ex077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[7];

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Digite o %dº nome: ", i + 1);
            nomes[i] = sc.nextLine();
        }

        for (int i = nomes.length - 1; i >= 0; i--)
            System.out.println(nomes[i]);
        
        sc.close();
    }
}
