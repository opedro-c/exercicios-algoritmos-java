import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.print("Salário: R$");
        float salario = sc.nextFloat();
        
        System.out.printf("O(A) funcionário(a) %s tem um salário de %.2f em Junho.\n", nome, salario);

        sc.close();
    }
}
