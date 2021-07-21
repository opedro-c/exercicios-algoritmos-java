import java.util.Scanner;

public class Ex025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        boolean trianguloPossivel;
        
        System.out.print("Informe o valor do 1º lado: ");
        a = sc.nextFloat();
        System.out.print("Informe o valor do 2º lado: ");
        b = sc.nextFloat();
        System.out.print("Informe o valor do 3º lado: ");
        c = sc.nextFloat();

        trianguloPossivel = a <= b + c && b <= a + c && c <= a + b;
        if (trianguloPossivel)
            System.out.println("Esse triângulo existe");
        else
            System.out.println("Esse triângulo não existe");
        
        sc.close();
    }
}
