package tasca4Testing.n1.ejercici3;

import org.junit.Test;

import static org.junit.Assert.assertThrows;


public class ArrayIndexTest {

    @Test
    public void testArrayIndex() {

        ArrayIndex arrayIndex = new ArrayIndex();

        assertThrows(ArrayIndexOutOfBoundsException.class, arrayIndex::lanzarError);

    }

}