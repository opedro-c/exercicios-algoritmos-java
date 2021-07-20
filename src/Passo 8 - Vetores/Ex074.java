public class Ex074 {
    public static void main(String[] args) {
        int vet[] = new int[10];

        for (int i = 0; i < vet.length; i++)
            vet[i] = (i % 2 == 0) ? 5 : 3;
    }
}
