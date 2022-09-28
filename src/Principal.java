//TEMÁTICA: MINHA GARAGEM (Carros e Motos)
//CCOMO USAR OS ARQUIVOS ENTRADA:
// CarroEsportivo: Atributos: a1,a2,a3 (Com vírgula sem espaço)
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

        // conta as linhas do arquivo entrada1.txt
        long quantLinhas1 = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("entrada1.txt"))) {
            while (reader.readLine() != null) quantLinhas1++;
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            BufferedReader reader = new BufferedReader(new FileReader("entrada1.txt")); // cria o objeto reader para ler a entrada1.txt.
            BufferedWriter writer = new BufferedWriter(new FileWriter("resultado1.txt")); // cria o objeto writer para escrever resultado2.txt.
            String l;
            ArrayList<Carro> garagemCarros = new ArrayList<Carro>(); // ArrayList que recebe os carros do arquivo entrada1.txt

            // adiciona os objetos instanciados pelo arquivo entrada1.txt ao ArrayList garagemMotos.
            for (int i = 0; i < quantLinhas1; i++) {
                l = reader.readLine();
                if (l == null) break;
                ArrayList<String> info = new ArrayList<String>(Arrays.asList(l.split(","))); // ArrayList para separar as palavras que estão no arquivo (linha por linha)
                if (info.get(0).equalsIgnoreCase("esportivo")){
                    CarroEsportivo carroEsportivo = new CarroEsportivo(info.get(1), Integer.parseInt(info.get(2)), info.get(3), info.get(4), Double.parseDouble(info.get(5)));
                    garagemCarros.add(carroEsportivo);
                }else {
                    CarroPasseio carroPasseio = new CarroPasseio(info.get(1), Integer.parseInt(info.get(2)), info.get(3), Integer.parseInt(info.get(4)));
                    garagemCarros.add(carroPasseio);
                }
            }
            System.out.println(garagemCarros);


            // media = sum(ArrayList)/count(ArrayList)
            ArrayList<Integer> idadesCarros = new ArrayList<>();

            for (int i = 0; i < quantLinhas1; i++) {
                idadesCarros.add((garagemCarros.get(i).getAno()));
                writer.write(String.format("Ano de fabricação do %dº carro: %d\n", (i+1), idadesCarros.get(i)));
            }
            int sum = 0;
            int i;

            for (i = 0; i < idadesCarros.size(); i++) {
                sum += idadesCarros.get(i);
            }

            int media = sum/idadesCarros.size();
            writer.write(String.format("A média de idade dos carros é %d", media));

            writer.close();
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


        long quantLinhas2 = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("entrada2.txt"))) {
            while (reader.readLine() != null) quantLinhas2++;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(quantLinhas2);

        try {
            BufferedReader reader = new BufferedReader(new FileReader("entrada2.txt")); // cria o objeto reader para ler a entrada2.txt.
            BufferedWriter writer = new BufferedWriter(new FileWriter("resultado2.txt")); // cria o objeto writer para escrever resultado2.txt.
            String linha;
            ArrayList<Moto> garagemMotos = new ArrayList<Moto>(); // ArrayList que recebe os carros do arquivo entrada2.txt

            // adiciona os objetos instanciados pelo arquivo entrada2.txt ao ArrayList garagemMotos.
            for (int i = 0; i < quantLinhas2; i++) {
                linha = reader.readLine();
                if (linha == null) break;
                ArrayList<String> info = new ArrayList<String>(Arrays.asList(linha.split(",")));
                if (info.get(0).equalsIgnoreCase("esportiva")) {
                    MotoEsportiva motoEsportiva = new MotoEsportiva(info.get(1), Integer.parseInt(info.get(2)), info.get(3), info.get(4), Double.parseDouble(info.get(5)));
                    garagemMotos.add(motoEsportiva);
                } else {
                    MotoPasseio  motoPasseio = new MotoPasseio(info.get(1), Integer.parseInt(info.get(2)), info.get(3),Integer.parseInt(info.get(4)));
                    garagemMotos.add(motoPasseio);
                }
            }
            System.out.println(garagemMotos);


            // Escreve o algorítmo de anos das motos e maior anos das motos na pasta resultado2.txt
            ArrayList<Integer> idadesMotos = new ArrayList<>();
            for (int i = 0; i < quantLinhas2; i++) {
                idadesMotos.add((garagemMotos.get(i).getAno()));
                writer.write(String.format("Ano de fabricação da %dº moto: %d\n", (i+1), idadesMotos.get(i)));
            }
            int maiorAno = 0;
            for (int i = 0; i < idadesMotos.size(); i++){
                if (idadesMotos.get(i) > maiorAno) {
                    maiorAno = garagemMotos.get(i).getAno();
                }
            }
            writer.write(String.format("Ano de fabricação da moto mais nova: %d", maiorAno));
            writer.close();
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
