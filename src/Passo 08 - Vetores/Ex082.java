import java.util.Scanner;

public class Ex082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] notas = new float[10];
        int numAcimaMedia = 0;
        float media, maiorNota = 0, somaNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a %dª nota: ", i + 1);
            notas[i] = sc.nextFloat();
            somaNotas += notas[i];
            if (i == 0)
                maiorNota = notas[i];
            else if (notas[i] > maiorNota)
                maiorNota = notas[i];
        }
        
        media = somaNotas / notas.length;
        System.out.println("Média da turma: " + media);
        
        System.out.print("Número de alunos acima da média: ");
        for (int i = 0; i < notas.length; i++)
            numAcimaMedia += (notas[i] > media) ? 1 : 0;
        System.out.println(numAcimaMedia);
        
        System.out.println("Maior nota digitada: " + maiorNota);
        
        System.out.println("Posições em que a maior nota aparece: ");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == maiorNota)
                System.out.printf("%d ", i + 1);
        }
        System.out.println();
        sc.close();
    }
}
