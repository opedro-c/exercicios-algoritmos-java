import java.util.Scanner;

public class Ex058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = 0, totAlunos = 0, somaIdades = 0;
        float mediaIdades;

        while (idade != 999) {
            System.out.print("Digite a idade do aluno [entre 999 para sair]: ");
            idade = sc.nextInt();
           
            somaIdades += (idade != 999) ? idade : 0;
            totAlunos += (idade != 999) ? 1 : 0;
        }

        mediaIdades = somaIdades / totAlunos;

        System.out.printf(
            "Total de alunos cadastrados: %d\n" +
            "Média de idade dos alunos: %.2f\n",
            totAlunos, mediaIdades
        );

        sc.close();
    }
}
