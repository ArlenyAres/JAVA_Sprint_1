package tasca4Testing.n1.ejercici1;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MesesTest {

    @Test
    public void test12Meses() {
        Meses meses = new Meses();
        assertEquals(12,meses.obtenerMeses().size());
    }

    @Test
    public void testListaNula() {
        Meses meses = new Meses();
        assertNotNull(meses.obtenerMeses());
    }

    @Test
    public void testListaAgosto() {
        Meses meses = new Meses();
        assertEquals("Agosto",meses.obtenerMeses().get(7));
    }

    //Otra forma
    @Test
    public void testLista() {
        Meses meses = new Meses();
        boolean condicion = false;

        if (meses.obtenerMeses().size() == 12 &&
            meses.obtenerMeses() != null &&
                "Agosto".equals(meses.obtenerMeses().get(7))){
            condicion = true;
        }
        assertEquals(true,condicion);

    }

}