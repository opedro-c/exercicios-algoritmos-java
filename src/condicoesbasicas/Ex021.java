package condicoesbasicas;

import java.util.Scanner;

public class Ex021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano;

        System.out.print("Informe o ano: ");
        ano = sc.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0)
            System.out.println("Esse ano é bissexto!");
        else
            System.out.println("Esse ano não é bissexto!");
        
        sc.close();
    }
}
