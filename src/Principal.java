//TEMÁTICA: MINHA GARAGEM (Carros e Motos)
//COMO USAR OS ARQUIVOS ENTRADA:
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

        long quantLinhas1 = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("entrada1.txt"))) {
            while (reader.readLine() != null) quantLinhas1++;
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("entrada1.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("resultado1.txt")); // Define uma pasta txt a ser criada
            String l;
            ArrayList<Carro> garagemCarros = new ArrayList<Carro>(); // ArrayList que recebe os carros do arquivo entrada1.txt


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
            int anoCarro0 = garagemCarros.get(0).getAno();
            int anoCarro1 = garagemCarros.get(1).getAno();
            int anoCarro2 = garagemCarros.get(2).getAno();
            int anoCarro3 = garagemCarros.get(3).getAno();
            int media = (anoCarro0 + anoCarro1 + anoCarro2 + anoCarro3)/4;
            writer.write(String.format("Ano de Fabricação do primeiro carro: %d" +
                    "\nAno de Fabricação do segundo carro: %d" +
                    "\nAno de Fabricação do terceiro carro: %d" +
                    "\nAno de Fabricação do quarto carro: %d" +
                    "\nMédia de idade entre os carros: %d",anoCarro0, anoCarro1, anoCarro2, anoCarro3, media)); // Escreve na pasta resultado1.txt
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
            BufferedReader reader = new BufferedReader(new FileReader("entrada2.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("resultado2.txt")); // Define uma pasta txt a ser criada
            String linha;
            ArrayList<Moto> garagemMotos = new ArrayList<Moto>();
            for (int i = 0; i < quantLinhas2; i++) { // Refactor: mudar o limite do for para o len de entrada.txt #PROBLEMA = o programa precisaria descobrir qual é esportiva e qual é passeio(PESQUISAR PELA DOCUMENTAÇÃO DO READER)
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
            int anoMoto0 = garagemMotos.get(0).getAno();
            int anoMoto1 = garagemMotos.get(1).getAno();
            int anoMoto2 = garagemMotos.get(2).getAno();
            int anoMoto3 = garagemMotos.get(3).getAno();
            int maiorAno = 0;
            for (int i = 0; i < 4; i++){
                if (garagemMotos.get(i).getAno() > maiorAno) {
                    maiorAno = garagemMotos.get(i).getAno();
                }
            }
            writer.write(String.format("Ano de Fabricação da primeira moto: %d" +
                    "\nAno de Fabricação da segunda moto: %d" +
                    "\nAno de Fabricação da terceira moto: %d" +
                    "\nAno de Fabricação da quarta moto: %d" +
                    "\nAno de fabricação da moto mais nova: %d",anoMoto0, anoMoto1, anoMoto2, anoMoto3, maiorAno));// Escreve na pasta resultado2.txt
            writer.close();
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
