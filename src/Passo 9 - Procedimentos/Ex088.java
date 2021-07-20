public class Ex088 {
    public static void main(String[] args) {
        gerador("Aprendendo Portugol", 4);
    }

    public static void gerador(String mensagem, int quantidade) {
        for (int i = 0; i < mensagem.length(); i++)
            System.out.print("-");
        System.out.println();
        for (int i = 0; i < quantidade; i++)
            System.out.println(mensagem);
        for (int i = 0; i < mensagem.length(); i++)
            System.out.print("-");
    }
}
