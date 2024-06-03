package tasca7Anotaciones.n2;
import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class Main {

    public static void main(String[] args) throws IOException {

        try {
            ObjectMapper mapper = new ObjectMapper();

            SimpleModule module = new SimpleModule();
            module.addSerializer(Cliente.class, new CustomClienteSerializer());
            module.addDeserializer(Cliente.class, new CustomClienteDeserializer());
            mapper.registerModule(module);

            Cliente cliente1 = new Cliente("javier", "Cevedo", "2654238L", 67898764);
            mapper.writeValue(new File("Clientes.json"), cliente1);
            System.out.println(mapper.writeValueAsString(cliente1));


            Cliente cliente2 = mapper.readValue(new File("Clientes.json"), Cliente.class);
            System.out.println(cliente2);



        } catch (DatabindException e) {
            e.printStackTrace();
        }


    }
}
