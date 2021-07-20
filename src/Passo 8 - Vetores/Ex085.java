import java.util.Scanner;

public class Ex085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[5];
        char[] sexo = new char[5];
        float[] salario = new float[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Informe o nome da %dª pessoa: ", i + 1);
            nome[i] = sc.nextLine();
            System.out.printf("Informe o sexo da %dª pessoa: ", i + 1);
            sexo[i] = sc.next().toUpperCase().charAt(0);
            System.out.printf("Informe o salário da %dª pessoa: R$", i + 1);
            salario[i] = sc.nextFloat();
            sc.nextLine();

        }

        System.out.println("Mulheres que ganham mais de R$5000 cadastradas: ");
        for (int i = 0; i < 5; i++) {
            if (sexo[i] == 'F' && salario[i] > 5000.0f) {
                System.out.printf("Nome: %s\nSalário: R$%.2f\n", nome[i], salario[i]);
                System.out.println("------------------------");
            }
        }

        sc.close();
    }
}
