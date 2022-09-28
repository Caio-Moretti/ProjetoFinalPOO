public class MotoEsportiva extends Moto implements Motor{
    private final String marcaMotor;
    private final double capacidade;

    public MotoEsportiva(String modelo, int ano, String cor, String marcaMotor, double capacidade) {
        super(modelo, ano, cor);
        this.marcaMotor = marcaMotor;
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
        return "\nMotoEsportiva{ " +
                "marca_motor='" + marcaMotor + '\'' +
                ", capacidade=" + capacidade +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                "}";
    }
}
