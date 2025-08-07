package smartphone;

public class Iphone implements Musical, Telefonico, Internet{
    
    // Musical
    public void tocar() {
        System.out.println("\n\nReproduzindo música...");
    }

    public void pausar() {
        System.out.println("\n\nMúsica pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("\n\nMúsica selecionada: " + musica);
    }



    // Telefonico
    public void ligar(String numero) {
        System.out.println("\n\nLigando para " + numero);
    }

    public void atender() {
        System.out.println("\n\nAtendendo ligação...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("\n\nIniciando correio de voz...");
    }



    // Internet
    public void exibirPagina(String url) {
        System.out.println("\n\nExibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("\n\nNova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("\n\nPágina atualizada.");
    }

}
