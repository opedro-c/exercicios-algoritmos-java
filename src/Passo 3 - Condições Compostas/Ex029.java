import java.util.Scanner;

public class Ex029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        float salario, novoSalario;
        int anosTrabalhando;

        System.out.print("Informe o nome do colaborador: ");
        nome = sc.nextLine();
        System.out.print("Informe o salário: R$");
        salario = sc.nextFloat();
        System.out.print("Informe o tempo de colaboração: ");
        anosTrabalhando = sc.nextInt();

        if (anosTrabalhando <= 3)
            novoSalario = salario * (1 + 0.03f);
        else if (anosTrabalhando > 3 && anosTrabalhando < 10)
            novoSalario = salario * (1 + 0.125f);
        else
            novoSalario = salario * (1 + 0.2f);
        
        System.out.printf(
            "Colaborador: %s\n" +
            "Salário antigo: R$%.2f\n" +
            "Novo salário: R$%.2f\n",
            nome, salario, novoSalario
        );

        sc.close();
    }
}
