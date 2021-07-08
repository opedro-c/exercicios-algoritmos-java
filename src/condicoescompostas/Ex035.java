package condicoescompostas;

import java.util.Scanner;

public class Ex035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipoCarro;
        float distancia, valorCarro, taxaKm;

        System.out.println("======================");
        System.out.println("      PEDRO CARS      ");
        System.out.println("======================");
        System.out.println("Que tipo de carro deseja alugar?");
        System.out.println("[1] Popular");
        System.out.println("[2] Luxo");
        System.out.print("--> ");
        tipoCarro = sc.nextInt();
        System.out.println("Distância a percorrer (Km): ");
        distancia = sc.nextFloat();

        if (tipoCarro == 1) {
            valorCarro = 90.0f;
            if (distancia <= 100)
                taxaKm = 0.2f;
            else
                taxaKm = 0.1f;
        }
        else {
            valorCarro = 150.0f;
            if (distancia <= 100)
                taxaKm = 0.3f;
            else
                taxaKm = 0.25f;
        }
        
        System.out.println("Total a ser pago: R$" + (valorCarro + distancia * taxaKm));
        
        sc.close();
    }
}
