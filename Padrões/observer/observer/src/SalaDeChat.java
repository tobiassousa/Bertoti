import java.util.ArrayList;
import java.util.List;

// Concrete Subject
public class SalaDeChat implements Sujeito {
    private List<Observer> usuarios = new ArrayList<>();

    @Override
    public void adicionarObservador(Observer usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void removerObservador(Observer usuario) {
        usuarios.remove(usuario);
    }

    @Override
    public void notificarObservadores(String mensagem) {
        for (Observer usuario : usuarios) {
            usuario.receberMensagem(mensagem);
        }
    }

    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem enviada: " + mensagem);
        notificarObservadores(mensagem);
    }
}
