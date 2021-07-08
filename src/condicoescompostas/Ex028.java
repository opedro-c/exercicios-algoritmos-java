package condicoescompostas;

import java.util.Scanner;

public class Ex028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float l, h, area;
        String classificacao;

        System.out.println("-------------------------");
        System.out.println("          TERRENO        ");
        System.out.println("-------------------------");
        System.out.print("Largura (m): ");
        l = sc.nextFloat();
        System.out.print("Altura (m): ");
        h = sc.nextFloat();
        
        area = l * h;

        if (area < 100)
            classificacao = "Terreno Popular";
        else if (area < 500)
            classificacao = "Terreno Master";
        else
            classificacao = "Terreno VIP";

        System.out.println("Área do terreno (m²): " + area);
        System.out.println("Classificação: " + classificacao);
        
        sc.close();
    }
}
