package tasca7Anotaciones.n2;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

public class CustomClienteDeserializer extends JsonDeserializer<Cliente> {

    public CustomClienteDeserializer() {
        super();
    }

    @Override
    public Cliente deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonNode node = p.getCodec().readTree(p);
        String nombre = node.get("nombre").asText();
        String apellido = node.get("apellido").asText();
        String dni = node.get("dni").asText();
        int telefono = node.get("telefono").asInt();

        return new Cliente(nombre, apellido, dni, telefono);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
