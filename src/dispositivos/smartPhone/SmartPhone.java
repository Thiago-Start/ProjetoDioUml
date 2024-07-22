package dispositivos.smartPhone;

import dispositivos.musicPlayer.ReproutorMusical;
import dispositivos.navegador.NavegadorInternet;
import dispositivos.telefone.AparelhoTelefonico;

public class SmartPhone implements ReproutorMusical, NavegadorInternet, AparelhoTelefonico {

    public void selecionarMusica(String musica) {
        System.out.println("Escolhendo Música no Smartphone.");
    }
    public void tocar() {
        System.out.println("Tocando Música no Smartphone.");
    }
    public void pausar() {
        System.out.println("Pausando Música no Smartphone.");
    }
    public void exibirPaginas(String url) {
        System.out.println("Exibindo páginas URL no Navegador do Smartphone.");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Navegador do Smartphone.");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando páginas no Navegador do Smartphone.");
    }
    public void ligar(String numero) {
        System.out.println("Chamada via Smartphone.");
    }
    public void atender() {
        System.out.println("Atendendo Chamada via Smartphone.");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz via Smartphone.");
    }
}
