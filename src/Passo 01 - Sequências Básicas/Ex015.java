import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diasTrabalhados;
        
        System.out.print("Dias trabalhados pelo funcionário: ");
        diasTrabalhados = sc.nextInt();

        System.out.println(
            "Sabendo que o funcionário trabalha 8h/dia e ganhar R$25/h" +
            " seu pagamento esse mês foi: R$" + diasTrabalhados * (8 * 25)
        );
        
        sc.close();
    }
}
