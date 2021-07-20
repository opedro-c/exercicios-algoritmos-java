public class Ex089 {
    public static void main(String[] args) {
        gerador("Portugol Studio", 3, 3);
    }

    public static void gerador(String mensagem, int quantidade, int borda) {
        String padrao = "-";
        if (borda == 1)
            padrao = "-";
        if (borda == 2)
            padrao = "=";
        if (borda == 3)
            padrao = "*";
        for (int i = 0; i < mensagem.length(); i++)
            System.out.print(padrao);
        System.out.println();
        for (int i = 0; i < quantidade; i++)
            System.out.println(mensagem);
        for (int i = 0; i < mensagem.length(); i++)
            System.out.print(padrao);
        System.out.println();
    }
}
