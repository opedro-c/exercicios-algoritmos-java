import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float metros;

        System.out.print("Digite a distância em metros: ");
        metros = sc.nextFloat();
       
        System.out.printf(
            "Kilômetros: %f\nHectômetro: %f\nDecâmetro: %f\nDecímetro: %f\nCentímetro: %f\nMilímetro: %f\n", 
            1000*metros, 100*metros, 10*metros, metros/10, metros/100, metros/1000
        );

        sc.close();
    }
}
