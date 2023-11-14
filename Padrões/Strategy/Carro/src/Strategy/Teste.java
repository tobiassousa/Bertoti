package Strategy;

public class Teste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        
        int velocidade = 60;  // Exemplo de velocidade
        
        carro.definirLocomocaoBaseadaNaVelocidade(velocidade);
        carro.realizarLocomocao();
    }
}
