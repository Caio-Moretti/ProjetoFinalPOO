public class CarroPasseio extends Carro{
    private int assentos;


    public CarroPasseio(String modelo, int ano, String cor, int assentos) {
        super(modelo, ano, cor);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
}
