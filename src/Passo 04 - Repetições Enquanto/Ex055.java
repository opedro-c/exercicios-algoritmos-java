import java.util.Random;
import java.util.Scanner;

public class Ex055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroDoComputador;
        int numeroDoUsuario;
        int cont = 0;
        
        System.out.println("Você tem 5 chances! Tente adivinhar o número (de 1 a 5) que estou pensando...");
        numeroDoComputador = random.nextInt(5) + 1;
        
        while (cont < 6) {
            System.out.printf("Digite aqui sua %dª tentativa --> ", cont+1);
            numeroDoUsuario = sc.nextInt();

            if (numeroDoUsuario > 0 && numeroDoUsuario < 6) {
                if (numeroDoComputador == numeroDoUsuario) {
                    System.out.println("Você acertou!");
                    break;
                }
                else
                    System.out.println("Você errou! Tente mais uma vez");
            }
            else
                System.out.println("Mas esse número não está nem entre os valores que falei..? Tenta de novo...");

            cont++;
        }
        
        sc.close();
    }
}
