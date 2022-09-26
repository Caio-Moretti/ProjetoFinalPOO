public class MotoPasseio extends Moto{
    private int velocidade_maxima;


    public MotoPasseio(String modelo, int ano, String cor, int velocidade_maxima) {
        super(modelo, ano, cor);
        this.velocidade_maxima = velocidade_maxima;
    }

    public int getVelocidade_maxima() {
        return velocidade_maxima;
    }

    public void setVelocidade_maxima(int velocidade_maxima) {
        this.velocidade_maxima = velocidade_maxima;
    }
}
