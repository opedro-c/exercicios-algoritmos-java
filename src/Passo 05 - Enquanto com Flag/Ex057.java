import java.util.Scanner;

public class Ex057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salario, totPagoHomem = 0, totPagoMulher = 0;
        char sexo, continuar = 'S';

        while (continuar == 'S') {
            System.out.print("Informe o sexo do colaborador [M/F]: ");
            sexo = sc.next().toUpperCase().charAt(0);
            System.out.print("Informe o salário do colaborador: R$");
            salario = sc.nextFloat();

            totPagoHomem += (sexo == 'M') ? salario : 0;
            totPagoMulher += (sexo == 'F') ? salario : 0;

            System.out.print("Deseja continuar cadastrando? [S/N] ");
            continuar = sc.next().toUpperCase().charAt(0);
        }

        System.out.printf(
            "Total de salário pago a homens: R$%.2f\n" +
            "Total de salário pago a mulheres: R$%.2f\n",
            totPagoHomem, totPagoMulher 
        );

        sc.close();
    }
}
