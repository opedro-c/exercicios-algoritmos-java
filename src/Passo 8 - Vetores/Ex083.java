import java.util.Random;

public class Ex083 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vet = new int[20];
        int[] vetOrganizado = new int[vet.length];
        int menorValor = 0, c = 0, numAparicoes = 0;
        boolean x;
        
        System.out.println("Valores sorteados: ");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = random.nextInt(10) + 1;
            System.out.printf("%d ", vet[i]);
        }

        while (c < vet.length) {
            x = true;
            if (c == 0) {
                for (int i = 0; i < vet.length; i++) {
                    if (i == 0)
                        menorValor = vet[i];
                    else if (vet[i] < menorValor)
                        menorValor = vet[i];
                }
            }
            else {
                for (int i = 0; i < vet.length; i++) {
                    if (vet[i] > vetOrganizado[c - 1] && x) {
                        menorValor = vet[i];
                        x = false;
                    }
                    else if (vet[i] < menorValor && vet[i] > vetOrganizado[c - 1])
                        menorValor = vet[i];
                }
            }
            
            for (int i = 0; i < vet.length; i++) {
                numAparicoes += (vet[i] == menorValor) ? 1 : 0;
            }
            c += numAparicoes;
            for (int i = c - numAparicoes; i < c; i++)
                vetOrganizado[i] = menorValor;
            numAparicoes = 0;
        }

        System.out.print("\nNúmeros sorteados organizados: ");
        for (int i = 0; i < vetOrganizado.length; i++)
            System.out.printf("%d ", vetOrganizado[i]);
        System.out.println();
    }
}