package tasca3Collections.n1.ejercici3;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> paisesMap = new HashMap<>();

        try {
            FileReader fileReader = new FileReader("paises//countries.txt");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] dataPair = line.split(" ");
                if (dataPair.length == 0) {
                    break;
                }

                String key = dataPair[0].trim();
                String value = dataPair[1].trim();
                paisesMap.put(key, value);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Dime tu nombre ");
        String nombre = sc.nextLine();

        Set<String> paisesSet = paisesMap.keySet();

        List<String> paisesLista = List.copyOf(paisesSet);
        Random randPaises = new Random();

        int puntos = 0;

        for(int i = 0; i < 10; i++) {

            int posicion = randPaises.nextInt(paisesLista.size());

            String pais = paisesLista.get(posicion);

            System.out.println("Pais aleatoria: " + pais);

            System.out.print("Dime el nombre de la  ciudad del pais: ");
            String ciudad = sc.nextLine();

            if ( ciudad.equals(paisesMap.get(pais))) {
                puntos++;
            }
        }

       sc.close();


        try {
            FileWriter fileWriter = new FileWriter("classificacio.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter) ;

            bufferedWriter.write("Nombre: " + nombre + "\n" + "Puntuacion: " + puntos + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
