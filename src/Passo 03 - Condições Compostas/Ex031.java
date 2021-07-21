import java.util.Random;
import java.util.Scanner;

public class Ex031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] jogadas = new String[] {"Pedra", "Papel", "Tesoura"};
        int jogador, pc;
        boolean vitoriaJogador;
        
        System.out.println("=======================");
        System.out.println("        JOKENPÔ        ");
        System.out.println("=======================");
        System.out.println("[1] Pedra");
        System.out.println("[2] Papel");
        System.out.println("[3] Tesoura");

        System.out.print("Faça sua jogada: ");
        jogador = sc.nextInt();

        pc = random.nextInt(3) + 1;

        System.out.printf("Você jogou %s!\nO computador jogou %s!\n", jogadas[jogador - 1], jogadas[pc - 1]);
        
        vitoriaJogador = jogador == 1 && pc == 3 || jogador == 2 && pc == 1 || jogador == 3 && pc == 2;
        
        if (vitoriaJogador)
            System.out.println("Você venceu!");
        else if (jogador == pc)
            System.out.println("Empatou!");
        else
            System.out.println("Você perdeu!");

        
        sc.close();
    }
}
