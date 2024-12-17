package apple;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    //métodos do Reprodutor Músical
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }    
    
    public void tocar() {
        System.out.println("Reproduzindo música ");
    }

    public void pausar() {
        System.out.println("Música pausada.");

    }

    //métodos do Aparelho Telefonico
    public void ligar(String numero){
        System.out.println("Ligando para: " + numero);
    }

    public void atender(){
        System.out.println("Atendendo ligação...");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de Voz...");
    }

    //Método do Navegador Internet
    public void exibirPagina(String url){
        System.out.println("Exibindo página " + url);
    }

    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina(){
        System.out.println("Página Atualizada.");;
    }



}
