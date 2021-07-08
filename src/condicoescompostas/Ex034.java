package condicoescompostas;

import java.util.Scanner;

public class Ex034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float peso, altura, imc;
        String situacao;

        System.out.print("Informe seu peso (kg): ");
        peso = sc.nextFloat();
        System.out.print("Informe sua altura (m): ");
        altura = sc.nextFloat();

        imc = (float) (peso / Math.pow(altura, 2));
        System.out.println("Seu IMC: " + imc);

        if (imc < 18.5)
            situacao = "Abaixo do Peso";
        else if (imc < 25)
            situacao = "Peso ideal";
        else if (imc < 30)
            situacao = "Sobrepeso";
        else if (imc < 40)
            situacao = "Obesidade";
        else
            situacao = "Obesidade Mórbida";
        
        System.out.println("Situação: " + situacao);

        sc.close();
    }
}
