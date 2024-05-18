package tasca4Testing.n1.ejercici2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDn1Test {

    @Test
    void calcularLetra() {
       String dniArray [] = {
               "86541283B",
               "41004576S",
               "75634246B",
               "54328577R",
               "67584932F",
               "74562808M",
               "26613394W",
               "67567932G",
               "67338492N",
               "26541283L",
       } ;

       for( String dni : dniArray){
           int num = Integer.parseInt(dni.substring(0, 8));
           char letraEsperada = dni.charAt(8);
           assertEquals(letraEsperada, CalculoDn1.calcularLetra(num));
       }


    }
}