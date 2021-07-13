public class Ex069 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, aux;

        for (int i = 0; i < 8; i++) {
            if (i == 0)
                System.out.print(n1 + " " + n2 + " ");
            aux = n2;
            n2 = n1 + n2;
            n1 = aux;
            System.out.print(n2 + " ");
        }
        System.out.println();
    }
}
