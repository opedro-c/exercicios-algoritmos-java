import java.util.Scanner;

public class Ex056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = 0, soma = 0;

        while (num != 1111) {
            System.out.print("Insira o valor (Digite '1111' para parar): ");
            num = sc.nextInt();
            soma += (num != 1111) ? num : 0;
        } 

        System.out.println("Soma dos valores digitados: " + soma);
        
        sc.close();
    }
}
