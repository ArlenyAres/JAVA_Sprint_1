package tasca5JavaUtils.n2;

import java.io.*;
import java.util.ArrayList;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        Properties prop = new Properties();

        try {
            prop.load(new FileInputStream("config.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File directorio = new File(prop.getProperty("directorioLeer"));

        ArrayList<String> listaDirectorio = new ArrayList<>();

        DirectorioListador.listaContenidoAlfabetico(directorio, listaDirectorio, 0);

        System.out.println(DirectorioListador.contenido);


        try (FileWriter fw = new FileWriter(prop.getProperty("directorioTxt") +
                prop.getProperty("nombreTxt") )) {
            fw.write(DirectorioListador.contenido);
        } catch (IOException e) {
            System.err.println("Objeto no encontrado" + e.getMessage());
        }

    }
}
