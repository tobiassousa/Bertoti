public class Usuario implements Observer {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println(nome + " recebeu a mensagem: " + mensagem);
    }
}