package tasca1Herencia.n2;

public class Smartphone extends Telefono implements Camara, Reloj {

    public Smartphone(String marca, String modelo) {
        super( marca, modelo);


    }

    @Override
    public void fotografiar() {
        System.out.println("Fotografando....");
    }

    /*@Override*/
    public void alarma(){
        System.out.println("Suena Alarma!!!!");
    }

}

