package tasca5JavaUtils.n1;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


    // Ejercicio 2
        File directorio = new File("/Users/Ares/Documents");

        ArrayList<String> listaDirectorio = new ArrayList<>();

        DirectorioListador.listaContenidoAlfabetico(directorio, listaDirectorio, 0);

//        System.out.println(DirectorioListador.contenido);

        // Ejercicio 3

        try(FileWriter fw = new FileWriter("listaContenido.txt")) {
            fw.write(DirectorioListador.contenido);

        } catch (IOException e) {
            System.err.println("Objeto nao encontrado" + e.getMessage());
        }

        // Ejercicio 4

        try(FileReader fr = new FileReader("paises/countries.txt");
            BufferedReader br = new BufferedReader(fr)) {
            String linea;
            while ((linea = br.readLine()) != null){
               System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ejercicio 5

        Persona person = new Persona("Ares", "Medina");

        try (FileOutputStream fos = new FileOutputStream("person.ser");
             ObjectOutputStream outputStream = new ObjectOutputStream(fos)) {
            outputStream.writeObject(person);

        } catch (IOException e) {
            System.err.println("Objeto nao encontrado" + e.getMessage());
        }

        try( FileInputStream fis = new FileInputStream("person.ser");
             ObjectInputStream inputStream = new ObjectInputStream(fis);) {
            Persona person2 = (Persona) inputStream.readObject();

//            System.out.println(person2.getApellido());

        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("Objeto nao encontrado" + e.getMessage());
        }


    }
}

