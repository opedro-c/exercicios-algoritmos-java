package condicoesbasicas;

import java.util.Scanner;

public class Ex024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float distancia, valorAPagar;

        System.out.println("Infome a distância a ser percorrida (km): ");
        distancia = sc.nextFloat();

        if (distancia > 200)
            valorAPagar = 0.5f * distancia;
        else
            valorAPagar = 0.45f * distancia;
        
        System.out.print("Sua viagem sairá por R$" + valorAPagar);

        sc.close();
    }
}
