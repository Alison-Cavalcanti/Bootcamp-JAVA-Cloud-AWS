public class Iphone2007 {
    public static void main(String[] args) {
        aparelhoTelefonico telefone = new aparelhoTelefonico();

        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();



        reprodutorMusical reprodutor = new reprodutorMusical();

        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica();

        navegadorInternet navegador = new navegadorInternet();

        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
