import apple.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

    //Reprodutor Musical
    meuIphone.selecionarMusica("Thiago Freitas - Fica");
    meuIphone.tocar();
    meuIphone.pausar();

    //Aparelho Telefônico
    meuIphone.ligar("9898119-0203");
    meuIphone.atender();
    meuIphone.iniciarCorreioVoz();

    //Navegador Internet
    meuIphone.exibirPagina("youtube.com");
    meuIphone.adicionarNovaAba();
    meuIphone.atualizarPagina();

    }
}
