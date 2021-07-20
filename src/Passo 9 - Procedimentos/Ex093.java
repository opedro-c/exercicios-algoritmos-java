import java.util.Scanner;

public class Ex093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio, fim, inc;
        System.out.println("Bem-vindo a seu contador!");
        System.out.print("Informe o início da contagem: ");
        inicio = sc.nextInt();
        System.out.print("Informe o fim da contagem: ");
        fim = sc.nextInt();
        System.out.print("Informe o incremento da contagem: ");
        inc = sc.nextInt();

        contador(inicio, fim, inc);

        sc.close();
    }

    public static void contador(int inicio, int fim, int incremento) {
        if (inicio > fim && incremento < 0) {
            for (int i = inicio; i >= fim; i += incremento) 
                System.out.printf("%d ", i);
            System.out.println();
        }
        else if (inicio < 20 && incremento > 0){
            for (int i = inicio; i <= fim; i += incremento) 
                System.out.printf("%d ", i);
            System.out.println();
        }
    }
}
