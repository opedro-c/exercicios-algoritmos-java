import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cigarrosPorDia, anosFumando, diasPerdidos;

        System.out.print("Quantos cigarros você fuma por dia? ");
        cigarrosPorDia = sc.nextInt();

        System.out.print("Há quantos anos você fuma? ");
        anosFumando = sc.nextInt();

        diasPerdidos = (10 * (cigarrosPorDia * 365 * anosFumando)) / (60 * 24);

        System.out.printf("Você perdeu %d dias de vida por causa do cigarro\n", diasPerdidos);

        sc.close();
    }
}
