public class CarroEsportivo extends Carro implements Motor{
    private final String marca_motor;
    private final double capacidade;


    public CarroEsportivo(String modelo, int ano, String cor, String marca_motor, double capacidade) {
        super(modelo, ano, cor);
        this.marca_motor = marca_motor;
        this.capacidade = capacidade;
    }

    public void freiar(){
        System.out.println("freiou esportivamente");
    }


    @Override
    public String getMarcaMotor() {
        return marca_motor;
    }

    @Override
    public double getCapacidade() {
        return capacidade;
    }
}
