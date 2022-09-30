public class CarroEsportivo extends Carro implements Motor{
    private final String marcaMotor;
    private double capacidade;


    public CarroEsportivo(String modelo, int ano, String cor, String marca_motor, double capacidade) {
        super(modelo, ano, cor);
        this.marcaMotor = marca_motor;
        this.capacidade = capacidade;
    }

    public void setCapacidade(double capacidade) throws IllegalMotorException {
        if(capacidade < 2.0) {
            throw new IllegalMotorException("Capacidade do motor nao e suficiente! :(");
        }

        this.capacidade = capacidade;
    }

    @Override
    public String getMarcaMotor() {
        return marcaMotor;
    }

    @Override
    public double getCapacidade() {
        return capacidade;
    }

    @Override
    public String toString() {
        return "\nCarroEsportivo{ " +
                "marca_motor='" + marcaMotor + '\'' +
                ", capacidade=" + capacidade +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                "}";
    }
}
