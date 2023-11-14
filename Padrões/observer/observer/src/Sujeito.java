public interface Sujeito {
    void adicionarObservador(Observer observador);
    void removerObservador(Observer observador);
    void notificarObservadores(String mensagem);
}