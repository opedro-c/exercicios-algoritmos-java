import java.util.Scanner;

public class Ex054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0, pesoMaisDe90 = 0,
            pesoMenos50AlturaMenos160 = 0,
            pesoMais100AlturaMais190 = 0;
        float altura, peso, mediaAlturas, 
            somaDasAlturas =0;

        while (cont < 7) {
            System.out.printf("Digite a altura da %dª pessoa (m): ", cont+1);
            altura = sc.nextFloat();
            somaDasAlturas += altura;
            System.out.printf("Digite o peso  da %dª pessoa (kg): ", cont+1);
            peso = sc.nextFloat();

            if (peso > 90)
                pesoMaisDe90++;
            if (peso < 50 && altura < 1.6f)
                pesoMenos50AlturaMenos160++;
            if (altura > 1.9f && peso > 100)
                pesoMais100AlturaMais190++;
            
            cont++;
        }

        mediaAlturas = somaDasAlturas / 7.0f;

        System.out.printf(
            "Média das alturas: %.2f\n" +
            "Quantidade de pessoas que pesam mais de 90kg: %d\n" +
            "Quantidade de pessoas que pesam menos de 50kg e medem mais de 1.60m: %d\n" +
            "Quantidade de pessoas que medem mais de 1.90m pesam mais de 100Kg: %d\n",
            mediaAlturas, pesoMaisDe90, pesoMenos50AlturaMenos160, pesoMais100AlturaMais190 
        );

        sc.close();
    }
}
