public class MotoPasseio extends Moto{
    private int velocidadeMaxima;


    public MotoPasseio(String modelo, int ano, String cor, int velocidadeMaxima) {
        super(modelo, ano, cor);
        this.velocidadeMaxima = velocidadeMaxima;
    }


    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidade_maxima) {
        this.velocidadeMaxima = velocidade_maxima;
    }


    @Override
    public String toString() {
        return "\nMotoPasseio{ " +
                "velocidadeMaxima='" + velocidadeMaxima + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                "}";
    }
}
