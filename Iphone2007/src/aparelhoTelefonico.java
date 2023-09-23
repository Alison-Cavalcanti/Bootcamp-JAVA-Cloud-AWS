public class aparelhoTelefonico {
    private boolean ligado;
    
    public void ligar() {
        ligado = true;
        if (ligado) {
        System.out.println("Aparelho ligado");
        } else {
            System.out.println("Aparelho desligado");
        }
        
    
    }
    
    public void atender() {
        System.out.println("Chamada atendida");
    }
    
    public void iniciarCorreioVoz() {
        System.out.println("Ligando Correio de Voz");
    }
    

    
}
