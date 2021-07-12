public class Ex043 {
    public static void main(String[] args) {
        int cont = 30;
        while (cont > 0) {
            if (cont % 4 == 0)
                System.out.printf("[%d] ", cont);
            else
                System.out.print(cont + " ");
            cont--;
        }
        System.out.println("Acabou!");
    }
}
