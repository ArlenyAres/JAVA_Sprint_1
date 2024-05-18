package tasca4Testing.n2;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class LongitudStringMatcherTest {

    @Test
    public void testLongitudStringMatcher() {
        String palabra = "Mordor";
        int longitudEsperada = 8;

        Matcher<Integer> matcher = CoreMatchers.equalTo(longitudEsperada);

        LongitudStringMatcher longitudStringMatcher = new LongitudStringMatcher(matcher,
                "Se espera que el tamaño sea : ", "El tamaño real es: ");

        assertThat(palabra, longitudStringMatcher);
    }


}