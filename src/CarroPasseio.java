public class CarroPasseio extends Carro{
    private int assentos;


    public CarroPasseio(String modelo, int ano, String cor, int assentos) {
        super(modelo, ano, cor);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) throws IllegalSeatException {
        if(assentos < 3) {
            throw new IllegalSeatException("Menos que tres assentos nao pode :(");
        }

        this.assentos = assentos;
    }

    @Override
    public String toString() {
        return "\nCarroPasseio{ " +
                "assentos='" + assentos + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                "}";
    }
}
