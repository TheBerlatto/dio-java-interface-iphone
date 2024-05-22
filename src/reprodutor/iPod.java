package reprodutor;

public class iPod implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println(musica + " selecionada!");
    }
}
