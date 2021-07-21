import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float h, l, area;

        System.out.print("Informe a altura em metros: ");
        h = sc.nextFloat();
        System.out.print("Informe a largura em metros: ");
        l = sc.nextFloat();

        area = l*h;

        System.out.printf("Área a ser pintada: %.2fm²\n", area);
        System.out.printf("Tinta necessária: %.2fL (supondo que cada litro pinte 2m²)\n", area/2.0);

        sc.close();
    }
}
