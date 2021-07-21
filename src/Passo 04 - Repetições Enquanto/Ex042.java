import java.util.Scanner;

public class Ex042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont, d = 1;
        System.out.print("Digite um valor: ");
        cont = sc.nextInt();
        while (d <= cont) {
            System.out.println(d);
            d++;
        }
        System.out.println("Acabou!");
        sc.close();
    }
}
