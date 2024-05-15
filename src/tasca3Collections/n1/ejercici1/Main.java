package tasca3Collections.n1.ejercici1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Month> months = new ArrayList<Month>();

        months.add(new Month("Enero"));
        months.add(new Month("Febrero"));
        months.add(new Month("Marzo"));
        months.add(new Month("Abril"));
        months.add(new Month("Mayo"));
        months.add(new Month("Junio"));
        months.add(new Month("Julio"));

        months.add(new Month("Septiembre"));
        months.add(new Month("Octubre"));
        months.add(new Month("Noviembre"));
        months.add(new Month("Diciembre"));

        for (int i = 0; i <months.size(); i++ ){
            System.out.println(months.get(i).getName());
        }

        months.add(7, new Month("Agosto"));

        for (int i = 0; i <months.size(); i++ ){
            System.out.println(months.get(i).getName());
        }

        HashSet<Month> lista = new HashSet<>( months );


        for (Month month : lista){
            System.out.println("ESTE " + month.getName());
        }


        for (int i = 0; i <months.size(); i++ ){
            System.out.println(months.get(i).getName());
        }


        Iterator<Month> iterator = months.iterator();
        while (iterator.hasNext()) {
            Month month = iterator.next();
            System.out.println(month.getName());
        }





    }

}
