public class CarroEsportivo extends Carro implements Motor{
    private final String marca_motor;
    private double capacidade;


    public CarroEsportivo(String modelo, int ano, String cor, String marca_motor, double capacidade) {
        super(modelo, ano, cor);
        this.marca_motor = marca_motor;
        this.capacidade = capacidade;
    }

    public void freiar(){
        System.out.println("freiou esportivamente");
    }

    public void setCapacidade(double capacidade) throws IllegalMotorException {
        if(capacidade < 2.0) {
            throw new IllegalMotorException("Capacidade do motor nao e suficiente! :(");
        }

        this.capacidade = capacidade;
    }

    @Override
    public String getMarcaMotor() {
        return marca_motor;
    }

    @Override
    public double getCapacidade() {
        return capacidade;
    }

    @Override
    public String toString() {
        return "Inner.CarroEsportivo{ " +
                "marca_motor='" + marca_motor + '\'' +
                ", capacidade=" + capacidade +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                '}';
    }
}
