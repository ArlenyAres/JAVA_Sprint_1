package Tasca1.N2;

public class Telefono {
    private String Marca;
    private String Modelo;


    public Telefono(String Marca, String Modelo) {
        this.Marca = Marca;
        this.Modelo = Modelo;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

   public void llamar (String numero){
        System.out.println(" te esta llamando este numero: " + numero);
   }
}
