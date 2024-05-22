package iphone;

import aparelhoTelefonico.AparelhoTelefonico;
import navegador.NavegadorInternet;
import reprodutor.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        System.out.println("Tocando música no iPhone...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada no iPhone...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println(musica + " selecionada no iPhone...");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "via iPhone...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma chamada no iPhone...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz no iPhone...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo " + url + " no iPhone...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba de navegação no iPhone...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página de navegação no iPhone...");
    }
}
