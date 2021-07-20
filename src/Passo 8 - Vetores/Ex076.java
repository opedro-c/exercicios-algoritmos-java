import java.util.Random;

public class Ex076 {
    public static void main(String[] args) {
        Random random = new Random();
        int vet[] = new int[7];

        for (int i = 0; i < vet.length; i++) 
            vet[i] = random.nextInt(101) + 1;
        for (int i = 0; i < vet.length; i++)
            System.out.println(vet[i]);
    }
}
