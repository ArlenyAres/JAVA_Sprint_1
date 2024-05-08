package tasca1.n1.Ex2;

public class Coche {

    // todos los objetos de la clase coche compartiran el mismo valor para estos atributos Marca y Modelo
    //atributo estaico final (constante)
    public static final String MARCA = "Volvo";

    //Atribut estatico
    public static String MODELO = "Deportivo";

    //atributo final = significa que su valor no puede ser cambiado una vez inicializado
    public final int POTENCIA;

    public Coche(String marca, String modelo, int potencia) {
        //los atributos estaticos se cargan al inicializar la clase
        // el atributo final no se puede cambiar
       this.POTENCIA = potencia;

    }


    public String getModelo() {
        return MODELO;
    }
    public int getPotencia() {
        return POTENCIA;
    }
    public String getMarca() {
        return MARCA;
    }


    //metodo estatico
    public static void frenar(){
        System.out.println( "El coche esta frenando");
    }

    // metodo no estatico
    public void acelerar(){
        System.out.println( "El coche esta acelerando");
    }
}
