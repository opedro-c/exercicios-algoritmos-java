package condicoescompostas;

import java.util.Scanner;

public class Ex030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        boolean trianguloPossivel, equilatero, isoceles;
        
        System.out.print("Informe o valor do 1º lado: ");
        a = sc.nextFloat();
        System.out.print("Informe o valor do 2º lado: ");
        b = sc.nextFloat();
        System.out.print("Informe o valor do 3º lado: ");
        c = sc.nextFloat();

        trianguloPossivel = a <= b + c && b <= a + c && c <= a + b;
        equilatero = a == b && b == c;
        isoceles = a == b && c != a || b == c && a != c || a == c && b != c;
        
        if (trianguloPossivel) {
            System.out.print("Esse triângulo existe e é ");
            if (equilatero)
                System.out.println("equilátero");
            else if (isoceles)
                System.out.println("isóceles");
            else
                System.out.println("escaleno");
        }
        else
            System.out.println("Esse triângulo não existe");
        
        sc.close();
    }
}
