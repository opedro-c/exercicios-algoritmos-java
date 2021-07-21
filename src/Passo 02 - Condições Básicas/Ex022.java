import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoDeNascimento, idade;

        System.out.print("Informe seu ano de nascimento: ");
        anoDeNascimento = sc.nextInt();

        idade = 2021 - anoDeNascimento;

        if (idade > 18)
            System.out.printf("Já passou %d anos do prazo de alistamento! Regularize sua situação!\n", idade - 18);
        else
            System.out.printf("Faltam %d anos para seu alistamento!\n", 18 - idade);
        
            sc.close();
    }
}
