public class Ex075 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, aux;
        int[] vet = new int[16];

        vet[0] = n2;
        for (int i = 1; i < vet.length; i++) {
            aux = n2;
            n2 = n1 + n2;
            n1 = aux;
            vet[i] = n2;
        }
    }
}
