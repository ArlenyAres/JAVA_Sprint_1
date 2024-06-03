package tasca7Anotaciones.n2;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class CustomClienteSerializer extends StdSerializer<Cliente> {


    public CustomClienteSerializer(){
        this(null);
    }

    public CustomClienteSerializer(Class<Cliente> t) {
        super(t);
    }

    @Override
    public void serialize(Cliente value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();
        gen.writeStringField("nombre", value.getNombre());
        gen.writeStringField("apellido", value.getApellido());
        gen.writeStringField("dni", value.getDni());
        gen.writeNumberField("telefono", value.getTelefono());
        gen.writeEndObject();
    }


}
