package tasca6Genericos.n1.ejercicio1;



public class NoGenericMethods {

   private String nombre;
   private String apellido;
   private String signo;


   public NoGenericMethods(String nombre, String apellido, String signo) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.signo = signo;

   }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", signo='" + signo + '\'' +
                '}';
    }
}
