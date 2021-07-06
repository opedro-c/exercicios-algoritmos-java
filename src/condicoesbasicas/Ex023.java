package condicoesbasicas;

import java.util.Scanner;

public class Ex023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char sexo;
        String nome;
        float preco, precoFinal;

        System.out.print("Informe seu nome: ");
        nome = sc.nextLine();

        System.out.print("Infome seu sexo: ");
        sexo = sc.next().charAt(0);

        System.out.print("Informe o preço do produto: R$");
        preco = sc.nextFloat();

        if (sexo == 'M')
            precoFinal = preco * (1 - 0.05f);
        else
            precoFinal = preco * (1 - 0.13f);
        
        System.out.printf("Olá, %s, com o desconto de 5%% seu produto sai por R$%.2f\n", nome, precoFinal);
        
        sc.close();
    }
}
