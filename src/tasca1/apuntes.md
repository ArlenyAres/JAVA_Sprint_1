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
