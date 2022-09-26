import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


public class Principal {
    public static void setForCar(int assentos, CarroPasseio carroPasseio) {
        try {
            carroPasseio.setAssentos(assentos);
        } catch(IllegalSeatException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
//            writer.write("funcionou");
//            writer.close();
//        } catch(IOException e){
//            e.printStackTrace();
//        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("entradas/entrada1.txt"));
            String l;
            ArrayList<Carro> garagemCarros = new ArrayList<Carro>();
            for (int i = 0; i < 4; i++) {
                l = reader.readLine();
                if (l == null) break;
                ArrayList<String> info = new ArrayList<String>(Arrays.asList(l.split(",")));
                if(i==0) {
                    CarroEsportivo carroDoAguiar = new CarroEsportivo(info.get(0), Integer.parseInt(info.get(1)), info.get(2), info.get(3), Double.parseDouble(info.get(4)));
                    garagemCarros.add(carroDoAguiar);
                } else if (i==1) {
                    CarroEsportivo carroDoCaio = new CarroEsportivo(info.get(0), Integer.parseInt(info.get(1)), info.get(2), info.get(3), Double.parseDouble(info.get(4)));
                    garagemCarros.add(carroDoCaio);
                } else if (i==2){
                    CarroPasseio carroReservaAguiar = new CarroPasseio(info.get(0), Integer.parseInt(info.get(1)), info.get(2), Integer.parseInt(info.get(3)));
                    garagemCarros.add(carroReservaAguiar);
                } else {
                    CarroPasseio carroReservaCaio = new CarroPasseio(info.get(0), Integer.parseInt(info.get(1)), info.get(2), Integer.parseInt(info.get(3)));
                    garagemCarros.add(carroReservaCaio);
                }
            }
            System.out.println(garagemCarros);
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("entradas/entrada2.txt"));
            String linha;
            ArrayList<Moto> garagemMotos = new ArrayList<Moto>();
            for (int i = 0; i < 4; i++) {
                linha = reader.readLine();
                if (linha == null) break;
                ArrayList<String> info = new ArrayList<String>(Arrays.asList(linha.split(",")));
                if(i==0) {
                    MotoEsportiva motoDoAguiar = new MotoEsportiva(info.get(0), Integer.parseInt(info.get(1)), info.get(2), info.get(3), Double.parseDouble(info.get(4)));
                    garagemMotos.add(motoDoAguiar);
                } else if (i==1) {
                    MotoEsportiva  motoDoCaio = new MotoEsportiva(info.get(0), Integer.parseInt(info.get(1)), info.get(2), info.get(3), Double.parseDouble(info.get(4)));
                    garagemMotos.add(motoDoCaio);
                } else if (i==2){
                    MotoPasseio  motoReservaCaio = new MotoPasseio(info.get(0), Integer.parseInt(info.get(1)), info.get(2),Integer.parseInt(info.get(3)));
                    garagemMotos.add(motoReservaCaio);
                } else {
                    MotoPasseio  motoReservaCaio = new MotoPasseio(info.get(0), Integer.parseInt(info.get(1)), info.get(2), Integer.parseInt(info.get(3)));
                    garagemMotos.add(motoReservaCaio);
                }
            }
            System.out.println(garagemMotos);
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

