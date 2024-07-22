package dispositivos.musicPlayer;

public class MusicPlayer implements ReproutorMusical{

    public void selecionarMusica() {
        System.out.println("Escolhendo Música.");
    }
    public void tocar() {
        System.out.println("Tocando Música.");
    }
    public void pausar() {
        System.out.println("Música pusada.");
    }
}
