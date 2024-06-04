## Bloques de Inicialización
Los bloques de inicialización son utilizados para inicializar variables de instancia de una clase. Hay dos tipos de bloques de inicialización: bloques de inicialización de instancia y bloques de inicialización anónimos.

Bloques de Inicialización de Instancia: Son bloques de código que se ejecutan cada vez que se crea una nueva instancia de la clase, justo después de llamar al constructor de esa instancia. Se utilizan para inicializar variables de instancia.

´´ public class Ejemplo {
int x;

 // Bloque de inicialización de instancia
    {
        x = 10;
        System.out.println("Bloque de inicialización de instancia ejecutado");
    }

    public Ejemplo() {
        System.out.println("Constructor ejecutado");
    }

    public static void main(String[] args) {
        Ejemplo ejemplo = new Ejemplo();
        System.out.println("Valor de x: " + ejemplo.x);
    }
}

## Bloques de Inicialización Anónimos: 
Son bloques de código sin nombre que se utilizan para inicializar variables de instancia en una línea, sin necesidad de un constructor. Se ejecutan justo después de llamar al constructor de la clase.

public class Ejemplo {
int x;

    // Bloque de inicialización anónimo
    {
        x = 10;
        System.out.println("Bloque de inicialización anónimo ejecutado");
    }

    public static void main(String[] args) {
        Ejemplo ejemplo = new Ejemplo();
        System.out.println("Valor de x: " + ejemplo.x);
    }
}

## Bloques Estáticos
Los bloques estáticos son utilizados para inicializar variables estáticas de una clase. Estos bloques se ejecutan solo una vez, cuando la clase es cargada por primera vez en la JVM (Java Virtual Machine).


public class Ejemplo {
static int x;

    // Bloque estático
    static {
        x = 10;
        System.out.println("Bloque estático ejecutado");
    }

    public static void main(String[] args) {
        System.out.println("Valor de x: " + Ejemplo.x);
    }
}


En este ejemplo, el bloque estático se ejecutará la primera vez que se acceda a la clase "Ejemplo", antes de que se invoque cualquier otro método o constructor.

Los bloques de inicialización y los bloques estáticos son útiles para inicializar variables de instancia y estáticas, respectivamente, de manera más flexible y compleja que simplemente inicializarlas en los constructores. También son útiles para ejecutar cierto código antes de que se creen instancias de la clase o antes de que se acceda a métodos estáticos.

## El constructor 
en Java es un tipo especial de método que se utiliza para inicializar objetos de una clase. Cuando creas una instancia (objeto) de una clase utilizando la palabra clave new, Java busca un constructor en esa clase para ejecutar. Aquí hay algunos puntos importantes sobre los constructores en Java:

## Características del Constructor
Nombre Igual al de la Clase: El constructor tiene el mismo nombre que la clase en la que se declara. No tiene un tipo de retorno, ni siquiera void.
Inicialización de Objetos: Su propósito principal es inicializar los objetos recién creados. Puede asignar valores iniciales a las variables de instancia y realizar otras inicializaciones necesarias.
Puede Sobrecargarse: Al igual que otros métodos, los constructores pueden tener múltiples versiones en una clase, siempre y cuando tengan diferentes listas de parámetros. Esto se conoce como sobrecarga de constructor.
No se Hereda: A diferencia de otros métodos, los constructores no se heredan. Sin embargo, si no se define ningún constructor en una clase, Java proporciona un constructor predeterminado (sin parámetros) automáticamente.


public class Persona {
String nombre;
int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona1 = new Persona("Juan", 30);
        System.out.println("Nombre: " + persona1.nombre);
        System.out.println("Edad: " + persona1.edad);
    }
}

## En este ejemplo:

La clase Persona tiene dos variables de instancia: nombre y edad.
Se define un constructor Persona(String nombre, int edad) que toma dos parámetros y los utiliza para inicializar las variables de instancia nombre y edad.
En el método main, se crea una nueva instancia de Persona llamada persona1 pasando un nombre y una edad como argumentos al constructor.
Se imprime el nombre y la edad de persona1.

## ¿Por Qué se Usa un Constructor?
El constructor se utiliza para garantizar que un objeto se inicialice correctamente antes de que se utilice en el programa. Puede ser útil para establecer valores predeterminados, realizar validaciones o ejecutar otras operaciones necesarias para preparar el objeto para su uso. En resumen, el constructor es esencial para la creación y la inicialización adecuada de objetos en Java.

## Que es una Interfaz en java
se trata de una clase que no puede ser implementada por sí misma, sino que otras clases la heredan y la implementan. De este modo, al emplear las interfaces, es posible establecer un conjunto de reglas que otras clases deberán seguir de forma estricta.

## ¿Qué contiene una interfaz en Java?
Una interfaz Java contiene una colección de métodos abstractos y propiedades constantes que permiten activar la herencia múltiple, es decir, que diferentes clases partan de la misma estructura.

Los métodos, los cuales deberán ser siempre públicos (public), no se implementan en la propia interfaz, sino que tan solo se declaran. Sin embargo, las clases que hereden la interfaz serán las encargadas de implementarla.

En este sentido, una interfaz de Java presenta las siguientes características:

#### Puede contener encabezados de métodos y constantes públicas, nunca implementaciones.
#### La clase no puede ser instanciada, tan solo implementada por una clase.
#### No se puede extender.
#### Las interfaces pueden implementar otras interfaces.
#### Una clase puede implementar varias interfaces.
#### Se pueden declarar métodos estáticos (Static).

##### Por otro lado, es necesario explicar la diferencia entre una interfaz de Java y una clase abstracta. Mientras que la primera es totalmente declarativa, la segunda puede implementar métodos que serán heredados por otras clases. Además, las clases abstractas solo pueden heredarse una vez, mientras que las interfaces permiten la herencia múltiple. 

### Las interfaces son tipos de datos
Al igual que las clases definen tipos concretos, las interfaces definen tipos abstractos de datos.

#### Como ya hemos visto, en Java una interface se define del siguiente modo:

````
[modificador acceso] interface nombreDelInterface {
[public static final] [tipo] constante = valor;
[public abstract] [tipo] nombreDelMetodo(argumentos);
}
````
Pueden formar parte de una interface:

Definición de constantes .

Declaración de métodos.


### Las interfaces son tipos de datos
Las clases implementan (implements) interface.

La clase que implementa una interface debe definir todos los métodos declarados en la interface.

Por defecto, los métodos declarados en una interface son public abstract.

Por defecto, todas las constantes definidas en una interface son public static final.

Para asegurarnos que un método de la clase está definiendo un método declarado en la interface utilizamos la anotación @Override sobre el método.


## TASCA 2

### Una excepción:
Son eventos anómalos que pueden ocurrir durante la ejecución de un programa y que alteran el flujo normal de ejecución. Estos eventos representan situaciones inesperadas o errores que deben ser manejados de manera adecuada para garantizar que el programa continúe ejecutándose de y evitar así interrupciones.

### Tipos de excepciones en Java

Las excepciones se dividen en tres categorías principales, cada una heredada de la clase base Throwable. 

### Estas categorías son:

#### Checked exceptions: 
Son excepciones que se deben declarar en la firma del método o capturar explícitamente en un bloque try-catch. Si una excepción comprobada no se maneja correctamente, el código no se compilará. Estas excepciones se heredan de la clase Exception.

#### Unchecked exceptions:
Son excepciones que no están obligadas a ser manejadas explícitamente. Estas excepciones ocurren durante la ejecución del programa y no se requiere que sean declaradas en la firma del método o capturadas mediante un bloque try-catch. Se heredan de la clase RuntimeException.

#### Errors: 
Son problemas graves que generalmente están fuera del control del programador y no deben manejarse explícitamente. Estos errores indican problemas serios que deberían detener la ejecución del programa. Se heredan de la clase Error.

### Algunas palabras sobre las palabras clave
#### El manejo de excepciones en Java se basa en el uso de las siguientes palabras clave en el programa:
#### try : 
define un bloque de código donde puede ocurrir una excepción;
#### catch - 
define un bloque de código donde se manejan las excepciones;
#### finally : 
define un bloque de código opcional que, si está presente, se ejecuta independientemente de los resultados del bloque de prueba.
Estas palabras clave se usan para crear construcciones especiales en el código:
#### try{}catch , try{}catch{}finally , try{}finally{} .
#### throw : 
se utiliza para generar una excepción;
#### throws : 
se utiliza en la firma del método para advertir que el método puede generar una excepción.

## Tasca 2 Resumen
Herencia: En Java, una clase puede heredar de otra clase, lo que significa que puede utilizar sus atributos y métodos. Por ejemplo, VentaVaciaException hereda de Exception.


Excepciones Personalizadas: Las excepciones personalizadas son útiles para manejar situaciones específicas en tu aplicación. Se definen extendiendo la clase Exception o alguna de sus subclases.


Lanzar y Capturar Excepciones: Usamos throw para lanzar una excepción y try-catch para capturarla y manejarla adecuadamente.



## Que es una excepción
Las excepciones, como todo en Java durante la ejecución de nuestras aplicaciones, son instancias de clases concretas.

Java nos informa de que algo ha ido mal porque recibimos un objeto de una clase que representa un determinado error.

int[] array = new int[10];
System.out.println(array[10]);
Para informarnos del error anterior, Java nos hace llegar una instancia de la clase ArrayIndexOutOfBoundsException.

FileReader fichero = new FileReader("este fichero no existe");
En este otro caso, Java nos hace llegar una instancia de la clase FileNotFoundException.

## Tipos de excepciones
### Excepciones irrecuperables: 
Hijas de Error. Son errores de la propia máquina virtual de Java.
### Excepciones que NO es necesario gestionar: 
Hijas de RunTimeException. Son excepciones muy comunes, por ejemplo NullPointerException, ArrayIndexOutOfBoundsException.
### Excepciones que es necesario gestionar: 
Hijas de Exception. Todas las demás, por ejemplo IOException.

### Cómo se gestiona una excepción
Java proporciona un mecanismo para la gestión de excepciones: los bloques try...catch[...finally]
```
    try{

    FileReader fichero = new FileReader("nombre del fichero");

    } catch (FileNotFoundException e) {

        e.printStackTrace();
    }
```
#### Como ves, el bloque finally es opcional.

### Cómo se gestiona una excepción
Un buen estilo de programación implica cerrar los ficheros una vez que hemos acabado de trabajar con ellos.
```
FileReader fichero = null;

try{

    fichero = new FileReader("nombre del fichero");

    } catch (FileNotFoundException e) {

        e.printStackTrace();

    } finally {

        if(fichero != null) fichero.close();

    }
```
#### Pero, el método close() también puede producir un error de tipo IOException, luego me exige un nuevo bloque try...catch.

Lo podemos escribir del siguiente modo:
```
FileReader fichero = null;

try{

    fichero = new FileReader("nombre del fichero");

    } catch (FileNotFoundException e) {

        e.printStackTrace();

     } finally {

    try {

    if(fichero != null)fichero.close();

    } catch (IOException e) {

    e.printStackTrace();
    }

}
```
El bloque anterior de código es bastante obtuso.

El truco es el siguiente:
````
try {
    try {
        fichero = new FileReader("Hola");
    } finally {
    fichero.close();
    }
  } catch(FileNotFoundException e) {
        e.printStackTrace();
  } catch (IOException e) {
        e.printStackTrace();
}
````


## Colletions

N2 ejecicio 2
List<Restaurante> sortedRestaurantes = restaurantes.stream()
.sorted(Comparator.comparing(Restaurante::getNombre).thenComparingInt(Restaurante::getPuntuacion))
.collect(Collectors.toList());




## Anotaciones 



### Nivel 2

En Jackson, los serializadores personalizados son clases que extienden la clase abstracta StdSerializer<T>, donde T es el tipo de objeto que deseas serializar.
De manera similar, los deserializadores personalizados son clases que extienden la clase abstracta JsonDeserializer<T>, donde T es el tipo de objeto que deseas deserializar.

Registro de Serializador y Deserializador Personalizados 

```
SimpleModule module = new SimpleModule();
```
Jackson utiliza módulos (SimpleModule) para agrupar y registrar varios componentes de personalización como serializadores y deserializadores. 
Un SimpleModule permite registrar estos componentes para clases específicas.

Añadir el serializador personalizado:

```
module.addSerializer(Cl`iente.class, new CustomClienteSerializer());
```
Esta línea registra un serializador personalizado (CustomClienteSerializer) para la clase Cliente. Cuando Jackson encuentra un objeto de la clase Cliente que necesita ser serializado, utilizará CustomClienteSerializer para convertir el objeto en JSON.
Aquí es donde defines cómo se debe estructurar el JSON resultante.

Añadir el deserializador personalizado: 
```
module.addDeserializer(Cliente.class, new CustomClienteDeserializer());

```

De manera similar, esta línea registra un deserializador personalizado (CustomClienteDeserializer) para la clase Cliente. Cuando Jackson encuentra un JSON que necesita ser deserializado en un objeto de la clase Cliente, utilizará CustomClienteDeserializer para convertir el JSON en un objeto Cliente.
Aquí es donde defines cómo leer el JSON y convertirlo de vuelta en un objeto Cliente.

Registrar el módulo en el ObjectMapper:
```
mapper.registerModule(module);

```
Finalmente, esta línea registra el módulo que has configurado en el ObjectMapper. Esto le dice a Jackson que utilice los serializadores y deserializadores personalizados definidos
en module cuando trabaje con objetos de la clase Cliente.

JsonDeserializer es una clase abstracta en la biblioteca Jackson que se utiliza para definir cómo deserializar un objeto JSON a un objeto Java de tipo específico. 
Esto es útil cuando necesitas un control personalizado sobre el proceso de deserialización, más allá de lo que Jackson proporciona por defecto.


```

Declara una clase pública llamada CustomClienteDeserializer que extiende JsonDeserializer para la clase Cliente


public class CustomClienteDeserializer extends JsonDeserializer<Cliente> {



 Sobrescribe el método deserialize, que toma un JsonParser y un DeserializationContext como parámetros
    
    @Override
    public Cliente deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        
        
        // Lee el arbol JSON completo desde el JsonParser y lo almacena en un JsonNode
        JsonNode node = p.getCodec().readTree(p);
        
        // Obtiene el valor del campo "nombre" del nodo JSON y lo almacena en la variable nombre
        String nombre = node.get("nombre").asText();
        
        // Obtiene el valor del campo "apellido" del nodo JSON y lo almacena en la variable apellido
        String apellido = node.get("apellido").asText();
        
        // Obtiene el valor del campo "dni" del nodo JSON y lo almacena en la variable dni
        String dni = node.get("dni").asText();
        
        // Obtiene el valor del campo "telefono" del nodo JSON y lo almacena en la variable telefono
        int telefono = node.get("telefono").asInt();

        // Crea y devuelve una nueva instancia de Cliente utilizando los valores obtenidos del JSON
        return new Cliente(nombre, apellido, dni, telefono);
    }
}
```




Una forma de deserializar
```
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

public class CustomClienteDeserializer extends JsonDeserializer<Cliente> {

    @Override
    public Cliente deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonNode node = p.getCodec().readTree(p);  // Leer el arbol JSON
        String nombre = node.get("nombre").asText();  // Obtener el campo "nombre"
        String apellido = node.get("apellido").asText();  // Obtener el campo "apellido"
        String dni = node.get("dni").asText();  // Obtener el campo "dni"
        int telefono = node.get("telefono").asInt();  // Obtener el campo "telefono"

        // Ejemplo de uso del contexto de deserialización para manejar excepciones
        try {
            if (node.get("telefono").isInt()) {
                telefono = node.get("telefono").intValue();
            } else {
                throw ctxt.mappingException("El campo 'telefono' debe ser un entero");
            }
        } catch (Exception e) {
            // Manejo de excepción usando el contexto de deserialización
            ctxt.handleWeirdStringValue(Integer.class, node.get("telefono").asText(), "No se pudo convertir 'telefono' a entero");
        }

        return new Cliente(nombre, apellido, dni, telefono);
    }
}
```
Registrar los Serializadores y Deserializadores en ObjectMapper

```


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

            // Registrar serializador y deserializador personalizados
            SimpleModule module = new SimpleModule();
            module.addSerializer(Cliente.class, new CustomClienteSerializer());
            module.addDeserializer(Cliente.class, new CustomClienteDeserializer());
            mapper.registerModule(module);

            // Crear un objeto Cliente
            Cliente cliente = new Cliente("Javier", "Cevedo", "2654238L", 67898764);

            // Serializar el objeto Cliente a JSON y escribir en un archivo
            mapper.writeValue(new File("Cliente.json"), cliente);

            // Deserializar el JSON desde el archivo a un objeto Cliente
            Cliente deserializedCliente = mapper.readValue(new File("Cliente.json"), Cliente.class);

            // Imprimir el objeto deserializado
            System.out.println("Cliente deserializado: " + deserializedCliente.getNombre() + " " +
                    deserializedCliente.getApellido() + " " +
                    deserializedCliente.getDni() + " " +
                    deserializedCliente.getTelefono());
        } catch (DatabindException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

## LAMBDAS
https://www.arquitecturajava.com/java-lambda/


### Ejercicio 1

En este ejercicio, se utiliza el método `stream()` para convertir una lista de Strings en un Stream, seguido por el método `filter()` para filtrar aquellos elementos que contienen la letra 'o'. Finalmente, se usa `collect()` para recolectar los resultados filtrados en una nueva lista. La razón por la cual esto es considerado una operación lambda es porque permite realizar operaciones complejas sobre colecciones de datos de manera concisa y legible, evitando bucles explícitos.

### Ejercicio 2

Similar al Ejercicio 1, aquí se utiliza `stream()`, `filter()` y `collect()`. Sin embargo, la condición dentro de `filter()` es más compleja, incluyendo una comprobación adicional de longitud de cadena. Esto demuestra cómo las lambdas pueden encapsular lógica compleja en una sola línea, haciendo el código más limpio y fácil de entender.

### Ejercicio 3

Este ejercicio muestra cómo usar una expresión lambda directamente en un método que espera una función (en este caso, `forEach`). La lambda simplemente imprime cada elemento de la lista. Este ejemplo ilustra cómo las lambdas pueden ser utilizadas para reemplazar implementaciones de métodos específicos, permitiendo una mayor flexibilidad y concisión en el código.

### Ejercicio 4

Aquí, se utiliza una referencia de método (`method reference`) en lugar de una expresión lambda. El objetivo es demostrar que las referencias de métodos son otra forma de trabajar con funciones anónimas en Java, ofreciendo una sintaxis aún más concisa cuando se desea invocar un método existente de una clase.

### Tipos de métodos de referencia
En Java, existen cuatro tipos de métodos de referencia:
#### Referencia a un método estático: 
Se utiliza para referenciar métodos estáticos de una clase.
#### Referencia a un método de instancia de un objeto particular: 
Permite referenciar métodos de instancia de un objeto específico.
#### Referencia a un método de instancia de una clase arbitraria: 
Se utiliza para referenciar métodos de instancia de cualquier objeto de una clase específica.
#### Referencia a un constructor: 
Nos permite referenciar constructores de una clase.

### Ejercicio 5

Este ejercicio introduce la idea de interfaces funcionales (`Functional Interfaces`), que son interfaces con solo un método abstracto. Se define una interfaz `PiCalculator` con un único método `getPiValue()`, y luego se crea una instancia de esta interfaz usando una expresión lambda. Esto demuestra cómo las interfaces funcionales permiten definir contratos para comportamientos específicos, que pueden ser implementados con cualquier tipo de expresión lambda o método referenciado.

### Ejercicio 6

Se utiliza `stream()`, `sorted()` con un comparador basado en la longitud de las cadenas, y finalmente `collect()`. Este ejercicio muestra cómo las streams y las lambdas pueden ser combinadas para realizar operaciones de clasificación complejas de manera eficiente y legible.

#### 1ro Creación de la Lista
Dentro del método main, se crea una lista llamada mixtura que contiene una mezcla de números enteros y cadenas de texto.
```
List<Object> mixtura = Arrays.asList(1, "uno", "dos", "tres", "cuatro", "cinco");
```
#### Procesamiento de la Lista con Streams
Para ordenar la lista, se utiliza un stream, que es una secuencia de elementos procesados en paralelo. Los streams son una característica introducida en Java 8 para trabajar con colecciones de manera más eficiente y funcional.

####  Ordenamiento
El método sorted() se aplica al stream para ordenar sus elementos. Se le pasa un Comparator que define cómo deben compararse los elementos para el ordenamiento.
```
.sorted(Comparator.comparingInt(Object::toString.length))
```
El Comparator se crea usando Comparator.comparingInt(), que toma una función que extrae una clave de comparación de cada objeto. En este caso, Object::toString.length es una referencia de método que convierte cada objeto a una cadena y obtiene su longitud, que será la clave de comparación.

#### Recolectar Resultados

Después de ordenar los elementos, se utiliza collect() para recolectar los elementos ordenados en una nueva lista.
```
.collect(Collectors.toList());

```
Collectors.toList() es un recolector que transforma el stream en una lista.

#### Impresión del Resultado
Finalmente, se imprime la lista ordenada.
```
System.out.println(ordenadoPorLongitud);
```



### Ejercicio 7

Similar al Ejercicio 6, pero con la adición de `Comparator.reverseOrder()` para invertir el orden de clasificación. Esto demuestra cómo las lambdas y streams pueden ser utilizadas para manipular datos de formas complejas y dinámicas, adaptándose a diferentes requisitos de ordenamiento.

### Ejercicio 8

Este ejercicio combina la creación de una interfaz funcional con la definición de una expresión lambda para implementarla. Al igual que el Ejercicio 5, demuestra el uso de interfaces funcionales y lambdas para definir y ejecutar comportamientos específicos de manera flexible.

El objetivo general de estos ejercicios es aprender a manejar la programación funcional con lambdas en Java, lo cual implica entender cómo las lambdas pueden ser utilizadas para crear expresiones de alto nivel que encapsulan acciones complejas, cómo las interfaces funcionales definen contratos para comportamientos específicos, y cómo las streams y las referencias de métodos complementan las capacidades de las lambdas para trabajar con colecciones de datos de manera eficiente y legible.


