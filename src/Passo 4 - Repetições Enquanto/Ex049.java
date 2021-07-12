import java.util.Scanner;

public class Ex049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, par = 0, impar = 0, cont = 0;
        while(cont < 7) {
            System.out.printf("Digite o %dº valor: ", cont+1);
            num = sc.nextInt();
            if (num % 2 == 0) 
                par++;
            else
                impar++;
            cont++;
        }
        System.out.println("Quantidade de números pares digitados: " + par);
        System.out.println("Quantidade de números ímpares digitados: " + impar);
        sc.close();

    }
}
