public class Ex072 {
    public static void main(String[] args) {
        int[] vet = new int[10];
        int num = 5;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = num;
            num += 5;
        }
    }
}
