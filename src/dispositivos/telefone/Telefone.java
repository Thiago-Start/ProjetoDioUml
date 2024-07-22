package dispositivos.telefone;

public class Telefone implements AparelhoTelefonico{
    public void ligar() {
        System.out.println("Discando via Telefone.");
    }
    public void atender() {
        System.out.println("Atendo chamada via Telefone.");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz via Telefone.");
    }
}
