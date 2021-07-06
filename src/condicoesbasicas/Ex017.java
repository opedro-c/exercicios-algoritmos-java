package condicoesbasicas;

import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float vel;

        System.out.print("Informe a velocidade do carro (km/h): ");
        vel = sc.nextFloat();

        if (vel > 80) {
            System.out.printf("Carro acima do limite permitido!\nMulta a ser paga: R$%.2f\n", 5*(vel-80));
        } 
        System.out.println("Fim da operação");
        
        sc.close();
    }
}
