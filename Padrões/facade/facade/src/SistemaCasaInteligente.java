class SistemaCasaInteligente {
    private Alexa Alexa;
    private Computador Computador;
    private Cortina Cortina;

    public SistemaCasaInteligente() {
        Alexa = new Alexa();
        Computador = new Computador();
        Cortina = new Cortina();
    }

    public void ligarCasa() {
        Alexa.ligar();
        Computador.ligar();
        Cortina.ligar();
        System.out.println("Casa preparada para jogar!");
    }

    public void desligarCasa() {
        Alexa.desligar();
        Computador.desligar();
        Cortina.desligar();
        System.out.println("Casa desligada, sem graça!");
    }
}