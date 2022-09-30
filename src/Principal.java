//TEMÁTICA: MINHA GARAGEM (Carros e Motos)
//CCOMO USAR OS ARQUIVOS ENTRADA:
// CarroEsportivo: Atributos: a1,a2,a3 (Com vírgula sem espaço)
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Principal {

    public static void setCapacidadeBySport(CarroEsportivo carroEsportivo, int capacidade) throws IllegalMotorException {
        try {
            carroEsportivo.setCapacidade(capacidade);
        } catch(IllegalMotorException e) {
            e.printStackTrace();
        }
    }

    public static void setAssentoBy(CarroPasseio carroPasseio, int assentos) throws IllegalSeatException {
        try {
            carroPasseio.setAssentos(assentos);
        } catch(IllegalSeatException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("entrada1.txt")); // cria o objeto reader para ler a entrada1.txt.
            BufferedWriter writer = new BufferedWriter(new FileWriter("resultado1.txt")); // cria o objeto writer para escrever resultado2.txt.
            int quantLinhas1 = 0;
            String l;
            ArrayList<Carro> garagemCarros = new ArrayList<Carro>(); // ArrayList que recebe os carros do arquivo entrada1.txt

            // adiciona os objetos instanciados pelo arquivo entrada1.txt ao ArrayList garagemMotos.
            for (int i = 0; i <= quantLinhas1; i++) {
                l = reader.readLine();
                if (l == null) break;
                quantLinhas1++;
                ArrayList<String> info = new ArrayList<String>(Arrays.asList(l.split(",")));// ArrayList para separar as palavras que estão no arquivo (linha por linha)

                if (info.get(0).trim().equalsIgnoreCase("esportivo")){
                    CarroEsportivo carroEsportivo = new CarroEsportivo(info.get(1).trim(), Integer.parseInt(info.get(2).trim()), info.get(3).trim(), info.get(4).trim(), Double.parseDouble(info.get(5).trim()));
                    garagemCarros.add(carroEsportivo);
                }else {
                    CarroPasseio carroPasseio = new CarroPasseio(info.get(1).trim(), Integer.parseInt(info.get(2).trim()), info.get(3).trim(), Integer.parseInt(info.get(4).trim()));
                    garagemCarros.add(carroPasseio);
                }
            }
            System.out.println(garagemCarros);

            // ArrayList dos anos de fabricação de cada carro.
            ArrayList<Integer> anosCarros = new ArrayList<>();

            for (int i = 0; i < quantLinhas1; i++) {
                anosCarros.add((garagemCarros.get(i).getAno()));
                writer.write(String.format("Ano de fabricação do(a) %s: %d\n", garagemCarros.get(i).modelo, anosCarros.get(i)));
            }
            int sum = 0;
            for (int i = 0; i < anosCarros.size(); i++) {
                sum += anosCarros.get(i);
            }

            int media = sum/anosCarros.size();
            writer.write(String.format("Média de ano dos carros: %d", media));

            writer.close();
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            BufferedReader reader = new BufferedReader(new FileReader("entrada2.txt")); // cria o objeto reader para ler a entrada2.txt.
            BufferedWriter writer = new BufferedWriter(new FileWriter("resultado2.txt")); // cria o objeto writer para escrever resultado2.txt.
            int quantLinhas2 = 0;
            String linha;
            ArrayList<Moto> garagemMotos = new ArrayList<Moto>(); // ArrayList que recebe os carros do arquivo entrada2.txt

            // adiciona os objetos instanciados pelo arquivo entrada2.txt ao ArrayList garagemMotos.
            for (int i = 0; i <= quantLinhas2; i++) {
                linha = reader.readLine();
                if (linha == null) break;
                quantLinhas2++;
                ArrayList<String> info = new ArrayList<String>(Arrays.asList((linha.trim()).split(",")));
                if (info.get(0).trim().equalsIgnoreCase("esportiva")) {
                    MotoEsportiva motoEsportiva = new MotoEsportiva(info.get(1).trim(), Integer.parseInt(info.get(2).trim()), info.get(3).trim(), info.get(4).trim(), Double.parseDouble(info.get(5).trim()));
                    garagemMotos.add(motoEsportiva);
                } else {
                    MotoPasseio  motoPasseio = new MotoPasseio(info.get(1).trim(), Integer.parseInt(info.get(2).trim()), info.get(3).trim(),Integer.parseInt(info.get(4).trim()));
                    garagemMotos.add(motoPasseio);
                }
            }
            System.out.println(garagemMotos);


            // Escreve o algorítmo de anos das motos e maior anos das motos na pasta resultado2.txt
            ArrayList<Integer> anosMotos = new ArrayList<>();
            for (int i = 0; i < quantLinhas2; i++) {
                anosMotos.add((garagemMotos.get(i).getAno()));
                writer.write(String.format("Ano de fabricação da %s: %d\n", garagemMotos.get(i).getModelo(), anosMotos.get(i)));
            }
            int maiorAno = 0;
            for (int i = 0; i < anosMotos.size(); i++){
                if (anosMotos.get(i) > maiorAno) {
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
