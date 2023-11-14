package Strategy;

public class Carro {

    private String nome;
    private Locomocao locomocao;

    public void setLocomocao(Locomocao loc) {
        locomocao = loc;
    }

    public void realizarLocomocao() {
        locomocao.locomover();
    }

    public void definirLocomocaoBaseadaNaVelocidade(int velocidade) {
        if (velocidade > 50) {
            setLocomocao(new Combustao());
        } else {
            setLocomocao(new Eletrico());
        }
    }
}
