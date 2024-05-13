package tasca2Exceptions.n2.controlador;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    public static Scanner sc = new Scanner(System.in);

    public static byte leerByte(String mensaje){
        try {
            System.out.println(mensaje);
            return sc.nextByte();
        }catch(InputMismatchException e){
            System.err.println("Error de formato al entrar el numero");
            sc.nextLine();

            return leerByte(mensaje);
        }

    }

    public static int leerInt(String mensaje){
     System.out.println(mensaje);
        try {
            return sc.nextInt();
        }catch(InputMismatchException e){
            sc.nextLine();
            System.err.println("Error de formato al entrar el numero entero");

            return leerInt(mensaje);
        }
    }

    public static float leerFloat(String mensaje){
        System.out.println(mensaje);
        try {
            return sc.nextFloat();
        }catch(InputMismatchException e){
            sc.nextLine();
            System.err.println("Error de formato, los numeros se tienen que separar por comas ");

            return leerFloat(mensaje);
        }
    }

    public static double leerDouble(String mensaje){
        System.out.println(mensaje);
        try {
            return sc.nextDouble();
        }catch(InputMismatchException e){
            sc.nextLine();
            System.err.println("Error de formato, los numeros se tienen que separar por comas ");

            return leerDouble(mensaje);
        }
    }

    public static char llegirChar(String mensaje){
        System.out.println(mensaje);
        try {
            String str = sc.next();
            if(str.length() == 1){
                return str.charAt(0);
            }else {
                throw new Exception();
            }
        }catch(Exception e){
            sc.nextLine();
            System.err.println("Error de formato, debe introducir un solo caracter");

            return llegirChar(mensaje);
        }
    };

    public static String llegirString(String mensaje){

        try {
           System.out.println(mensaje);
            String str = sc.next();
            if(str.length() >= 2){
                return str;
            }else {
                throw new Exception();
            }
        }catch(Exception e){
            sc.nextLine();
            System.err.println("Error de formato, debe introducir una palabra ");
//            sc.nextLine();

            return llegirString(mensaje);
        }
    }

  public static boolean llegirSiNo(String mensaje){

      System.out.println(mensaje);
      try {
          String str = sc.next();
          if(str.equalsIgnoreCase("s"))  {
              return true;
          }else if(str.equalsIgnoreCase("n")) {
              return false;
          }else {
              throw new Exception();
          }
      }catch(Exception e){
          sc.nextLine();
          System.err.println("Error de formato, debe introducir s o n");

          return llegirSiNo(mensaje);
      }
  }



    public static void close(){
        sc.close();
    }
}
