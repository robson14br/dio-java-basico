// Classe iPhone implementando as interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Iniciando Musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Musica...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }

    

    // Método principal para testar
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();
        
        meuiPhone.selecionarMusica("Bohemian Rhapsody");
        meuiPhone.tocar();
        meuiPhone.pausar();
        
        meuiPhone.ligar("31-99900-0099");
        meuiPhone.atender();
        
        meuiPhone.exibirPagina("https://www.google.com");
        meuiPhone.atualizarPagina();
    }
}
