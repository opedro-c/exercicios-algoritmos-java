import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float km, valorAPagar; 
        int dias;

        System.out.print("Distância percorrida (km): ");
        km = sc.nextFloat();

        System.out.print("Dias alugados: ");
        dias = sc.nextInt();

        valorAPagar = 90 * dias + 0.2f*km;

        System.out.println("Valor a pagar: R$" + valorAPagar);

        sc.close();
    }   
}
