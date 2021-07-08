package condicoescompostas;

import java.util.Scanner;

public class Ex036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas, pontosPorHora;
        float dinheiroGanho;

        System.out.print("Quantas horas de atividade física você fez no mês? ");
        horas = sc.nextInt();

        if (horas <= 10)
            pontosPorHora = 2;
        else if (horas <= 20)
            pontosPorHora = 5;
        else 
            pontosPorHora = 10;

        dinheiroGanho = 0.05f * (horas * pontosPorHora);

        System.out.println("Você ganhou : R$" + dinheiroGanho);

        sc.close();
    }
}
