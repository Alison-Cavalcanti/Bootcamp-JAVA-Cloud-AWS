public class reprodutorMusical {
    private boolean reproduzindo;

    public void tocar() {
        reproduzindo = true;
        if (reproduzindo) {
        System.out.println("Tocando música");
        }
    }

    public void pausar() {
        reproduzindo = false;
        System.out.println("Música pausada");  
    }

    public void selecionarMusica() {
        System.out.println("Música selecionada");
    }
}
