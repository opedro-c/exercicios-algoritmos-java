public class Ex087 {
    public static void main(String[] args) {
        gerador("Aprendendo Portugol!");
    }

    public static void gerador(String mensagem) {
        for (int i = 0; i < mensagem.length(); i++)
            System.out.print("-");
        System.out.println("\n" + mensagem);
        for (int i = 0; i < mensagem.length(); i++)
            System.out.print("-");
    }
}
