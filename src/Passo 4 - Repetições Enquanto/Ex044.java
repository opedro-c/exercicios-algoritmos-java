import java.util.Scanner;

public class Ex044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio, fim, passo;
        
        System.out.print("Informe o inicio: ");
        inicio = sc.nextInt();
        System.out.print("Informe o fim: ");
        fim = sc.nextInt();
        System.out.print("Informe o incremento: ");
        passo = sc.nextInt();

        while (inicio < fim) {
            System.out.println(inicio);
            inicio += passo;
        }

        System.out.println("Acabou!");

        sc.close();
    }
}
