package condicoescompostas;

import java.util.Random;
import java.util.Scanner;

public class Ex032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroDoComputador;
        int numeroDoUsuario;

        numeroDoComputador = random.nextInt(5) + 1;
        System.out.println("Tente adivinhar o número (de 1 a 5) que estou pensando...");

        System.out.print("Digite aqui --> ");
        numeroDoUsuario = sc.nextInt();

        System.out.println("Eu estava pensando no número " + numeroDoComputador);

        if (numeroDoUsuario > 0 && numeroDoUsuario < 6) {
            if (numeroDoComputador == numeroDoUsuario)
                System.out.println("Você acertou!");
            else
                System.out.println("Você errou!");
        }
        else
            System.out.println("Mas esse número não está nem entre os valores que falei..?");
        
        sc.close();
    }
}
