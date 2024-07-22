package dispositivos.apple;

import dispositivos.musicPlayer.MusicPlayer;
import dispositivos.musicPlayer.ReproutorMusical;
import dispositivos.navegador.NavegadorInternet;
import dispositivos.smartPhone.SmartPhone;
import dispositivos.telefone.AparelhoTelefonico;
import dispositivos.telefone.Telefone;

public class Iphone {
    public static void main(String[] args) {
        SmartPhone iphone16 = new SmartPhone();
        ReproutorMusical song = iphone16;
        NavegadorInternet web = iphone16;
        AparelhoTelefonico tele = iphone16;

        song.selecionarMusica();
        song.tocar();
        song.pausar();

        web.exibirPaginas();
        web.adicionarNovaAba();
        web.atualizarPagina();

        tele.ligar();
        tele.atender();
        tele.iniciarCorreioVoz();
    }
}
