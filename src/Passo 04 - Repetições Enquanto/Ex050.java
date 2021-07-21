import java.util.Random;

public class Ex050 {
    public static void main(String[] args) {
        Random random = new Random();
        int num, maior5 = 0, div3 = 0, cont = 0;
        System.out.println("Números sorteados: ");
        while (cont < 20) {
            num = random.nextInt(11);
            System.out.println(num);
            if (num % 3 == 0)
                div3 += 1;
            if (num > 5)
                maior5 += 1;
            cont++;
        }
        System.out.println("Quantidade de números maiores que 5 sorteados: " + maior5);
        System.out.println("Quantidade de números divisíveis por 3 sorteados: " + div3);
    }
    
}
