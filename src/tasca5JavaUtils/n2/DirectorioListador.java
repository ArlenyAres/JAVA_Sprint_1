package tasca5JavaUtils.n2;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class DirectorioListador {

    protected static String contenido = "";

    public static void listaContenidoAlfabetico(File directorio, ArrayList<String> listaDirectorios, int nivel) {
        String separador = " ";

        for (int i = 0; i < nivel ; i++) {
            separador += "     ";
        }

        ArrayList<File> directoriosOrganizado = new ArrayList<>(Arrays.asList(directorio.listFiles()));
        Collections.sort(directoriosOrganizado, (f1, f2) -> f1.getName().compareTo(f2.getName()));

        for (File dir : directoriosOrganizado) {

            if (dir.isDirectory()) {
//                System.out.println(separador + "(D): " + dir.getName() + " (" + new Date(dir.lastModified()) + ")") ;
                contenido += separador + "(D): " + dir.getName() + " (" + new Date(dir.lastModified()) + ")\n";
                listaContenidoAlfabetico(dir, listaDirectorios, nivel + 1);
            } else {
               // System.out.println(separador + "(F): " + nombreDir  + " (" + new Date(dir.lastModified()) + ")");
                contenido += separador + "(F): " + dir.getName() + " (" + new Date(dir.lastModified()) + ")\n";

                listaDirectorios.add(dir.getName());

            }



        }

    }
}