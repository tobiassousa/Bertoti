public class ChatTest {
    public static void main(String[] args) {
        // Criando a sala de chat
        SalaDeChat salaDeChat = new SalaDeChat();

        // Criando usuários
        Usuario usuario1 = new Usuario("Alice");
        Usuario usuario2 = new Usuario("Bob");
        Usuario usuario3 = new Usuario("Charlie");

        // Adicionando usuários à sala de chat
        salaDeChat.adicionarObservador(usuario1);
        salaDeChat.adicionarObservador(usuario2);
        salaDeChat.adicionarObservador(usuario3);

        // Enviando mensagens
        salaDeChat.enviarMensagem("Olá a todos!");

        // Removendo um usuário
        salaDeChat.removerObservador(usuario2);

        // Enviando outra mensagem após a remoção
        salaDeChat.enviarMensagem("Como estão todos?");
    }
}
