public class MotoEsportiva extends Moto implements Motor{
    private final String marca_motor;
    private final double capacidade;

    public MotoEsportiva(String modelo, int ano, String cor, String marca_motor, double capacidade) {
        super(modelo, ano, cor);
        this.marca_motor = marca_motor;
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
        return "Inner.MotoEsportiva{ " +
                "marca_motor='" + marca_motor + '\'' +
                ", capacidade=" + capacidade +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                '}';
    }
}
