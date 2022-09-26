import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Principal {
    public static void main(String[] args) {


        try {
            BufferedReader reader = new BufferedReader(new FileReader("entradas/entrada1.txt"));
            String l;
            ArrayList<Carro> garagem = new ArrayList<Carro>();
            for (int i = 0; i < 4; i++) {
                l = reader.readLine();
                if (l == null) break;
                ArrayList<String> info = new ArrayList<String>(Arrays.asList(l.split(",")));
                if(i==0) {
                    CarroEsportivo carroDoAguiar = new CarroEsportivo(info.get(0), Integer.parseInt(info.get(1)), info.get(2), info.get(3), Double.parseDouble(info.get(4)));
                    garagem.add(carroDoAguiar);
                } else if (i==1) {
                    CarroEsportivo carroDoCaio = new CarroEsportivo(info.get(0), Integer.parseInt(info.get(1)), info.get(2), info.get(3), Double.parseDouble(info.get(4)));
                    garagem.add(carroDoCaio);
                } else if (i==2){
                    CarroPasseio carroReservaAguiar = new CarroPasseio(info.get(0), Integer.parseInt(info.get(1)), info.get(2), Integer.parseInt(info.get(3)));
                    garagem.add(carroReservaAguiar);
                } else {
                    CarroPasseio carroReservaCaio = new CarroPasseio(info.get(0), Integer.parseInt(info.get(1)), info.get(2), Integer.parseInt(info.get(3)));
                    garagem.add(carroReservaCaio);
                }
            }
            garagem.get(0).freiar();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

















//        CarroEsportivo carro_do_aguiar = new CarroEsportivo("Ferrari Spider", 2020, "amarelo","Mercedes", 3.0);
//        MotoPasseio moto_do_aguiar = new MotoPasseio("Pop100", 2019, "Verde", 200);
//
//        CarroPasseio carro_do_caio = new CarroPasseio("Toyota Corolla", 2021, "Prata", 5);
//        MotoEsportiva moto_do_caio = new MotoEsportiva("Kawasaki Ninja", 2018, "Vermelha", "Fiat", 1.0);
//
//        System.out.println(carro_do_aguiar.getCapacidade());
//        System.out.println(carro_do_aguiar.getMarcaMotor());
//        System.out.println(moto_do_caio.getCapacidade());
//        System.out.println(moto_do_caio.getMarcaMotor());
//        System.out.println(carro_do_aguiar);
//        System.out.println(moto_do_aguiar);
//        System.out.println(carro_do_caio);
//        System.out.println(moto_do_caio);