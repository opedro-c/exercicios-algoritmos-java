import java.util.Scanner;

public class Ex051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        float precoProduto, maiorPreco = 0, menorPreco = 0;
        while (cont < 8) {
            System.out.printf("Digite o preço do %dº produto: R$", cont+1);
            precoProduto = sc.nextFloat();
            if (cont == 0){
                maiorPreco = precoProduto;
                menorPreco = precoProduto;
            }
            else {
                if (precoProduto > maiorPreco)
                    maiorPreco = precoProduto;
                if (precoProduto < menorPreco)
                    menorPreco = precoProduto;
            }
            cont++;
        }
        System.out.println("Maior preço: R$" + maiorPreco);
        System.out.println("Menor preço: R$" + menorPreco);
        sc.close();
    }
}
