import java.util.Scanner;

public class Ex048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, cont = 0;
        
        while (cont < 7) {
            System.out.printf("Digite o %dº valor: ", cont+1);
            soma += sc.nextInt();
            cont++;
        }

        System.out.println("Somatório: " + soma);

        sc.close();
    }
}
