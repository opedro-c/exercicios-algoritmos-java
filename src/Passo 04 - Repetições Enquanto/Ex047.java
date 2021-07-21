public class Ex047 {
    public static void main(String[] args) {
        int cont = 500, soma = 0;
        while (cont > 0) {
            soma += cont;
            cont -= 50;
        }
        System.out.println(soma);
    }
}
