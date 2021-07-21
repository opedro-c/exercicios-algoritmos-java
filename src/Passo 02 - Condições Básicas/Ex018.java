import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoDeNascimento, idade;

        System.out.print("Informe seu ano de nascimento: ");
        anoDeNascimento = sc.nextInt();

        idade = 2021 - anoDeNascimento;

        System.out.println("Sua idade: " + idade);

        if (idade >=  18) 
            System.out.println("Você já pode votar!");
        else
            System.out.println("Você ainda não pode votar!");

        sc.close();
    }
}
