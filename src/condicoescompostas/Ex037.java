package condicoescompostas;

import java.util.Scanner;

public class Ex037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salarioAtual, novoSalario, reajusteSalarial;
        char sexo;
        int anosTrabalhando;

        System.out.print("Digite o salário atual do colaborador: R$");
        salarioAtual = sc.nextFloat();
        System.out.print("Informe o sexo do colaborador: ");
        sexo = sc.next().charAt(0);
        System.out.print("Anos que o colaborador trabalha na empresa: ");
        anosTrabalhando = sc.nextInt();

        if (sexo == 'F') {
            if (anosTrabalhando < 15)
                reajusteSalarial = 0.05f;
            else if (anosTrabalhando <= 20)
                reajusteSalarial = 0.12f;
            else
                reajusteSalarial = 0.23f;
        }
        else {
            if (anosTrabalhando < 20)
                reajusteSalarial = 0.03f;
            else if (anosTrabalhando < 30)
                reajusteSalarial = 0.13f;
            else
                reajusteSalarial = 0.25f;
        }

        novoSalario = salarioAtual * (1 + reajusteSalarial);

        System.out.println("Novo salário: R$" + novoSalario);

        sc.close();

    }
}
