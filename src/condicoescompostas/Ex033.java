package condicoescompostas;

import java.util.Scanner;

public class Ex033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valorDaCasa, salario, valorMensalidade;
        int anosAPagar;

        System.out.println("======================");
        System.out.println("    BANCO DO PEDRO    ");
        System.out.println("======================");
        System.out.print("Informe o valor da casa: R$");
        valorDaCasa = sc.nextFloat();
        System.out.print("Seu salário: R$");
        salario = sc.nextFloat();
        System.out.print("Em quantos anos pretende pagar? ");
        anosAPagar = sc.nextInt();

        valorMensalidade = valorDaCasa / (anosAPagar * 12);
        System.out.println("Valor da mensalidade: R$" + valorMensalidade);

        if (valorMensalidade > salario * 0.3f)
            System.out.println("Empréstimo negado!");
        else
            System.out.println("Empréstimo aceito!");

        sc.close();
    }
}
