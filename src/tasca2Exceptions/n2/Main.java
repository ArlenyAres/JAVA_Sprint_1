package tasca2Exceptions.n2;

import tasca2Exceptions.n2.controlador.Entrada;

public class Main {
    public static void main(String[] args) {

//        byte edad = Entrada.leerByte("Entra tu edad: ");
//        System.out.println("Edad: " + edad);
//
//        int id = Entrada.leerInt("Entra tu ID: ");
//        System.out.println("Id: " + id);
//
//        float estatura = Entrada.leerFloat("Entra tu estatura: ");
//        System.out.println("estatura " + estatura);
//
//        double precio = Entrada.leerDouble("Entra tu precio: ");
//        System.out.println("Precio: " + precio);

        char letra = Entrada.llegirChar("Entra tu letra: ");
        System.out.println("letra: " + letra);

//
//        String palabra = Entrada.llegirString("Entra tu Palabra: ");
//        System.out.println("Palabra: " + palabra);
//
//        boolean siNo = Entrada.llegirSiNo("Entra s o n: ");
//       System.out.println("Palabra: " + siNo);



        Entrada.close();
    }





}
