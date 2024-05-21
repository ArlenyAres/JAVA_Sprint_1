package tasca5JavaUtils.n1;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


    // Ejercicio 2
        File directorio = new File("/Users/Ares/Documents");

        ArrayList<String> listaDirectorio = new ArrayList<String>();

        DirectorioListador.listaContenidoAlfabetico(directorio, listaDirectorio, 0);

//        System.out.println(DirectorioListador.contenido);

        // Ejercicio 3

        try {
            FileWriter fw = new FileWriter("listaContenido.txt");
            fw.write(DirectorioListador.contenido);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Ejercicio 4

        try {
            FileReader fr = new FileReader("paises/countries.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null){
               System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Ejercicio 5

        Persona person = new Persona("Ares", "Medina");

        try {
            FileOutputStream fos = new FileOutputStream("person.ser");
            ObjectOutputStream outputStream = new ObjectOutputStream(fos);
            outputStream.writeObject(person);
            outputStream.close();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fis = new FileInputStream("person.ser");
            ObjectInputStream inputStream = new ObjectInputStream(fis);
            Persona person2 = (Persona) inputStream.readObject();
            inputStream.close();
            fis.close();
//            System.out.println(person2.getApellido());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}

