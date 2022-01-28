import java.util.Scanner;


public class exer19 {

    public static Scanner  myInput = new Scanner (System.in);

    public static String obtenerNif(){
        System.out.println("Indica tu nif");
        return myInput.nextLine();
    }


    public static String comprobar (String nif){
        String tabla = new String ("TRWAGMYFPDCBNJZSQVHLCKE");
        char letraIntroducida = nif.charAt(8);
        String dni = "";
        for (int i = 0; i < nif.length() - 1; i++){
            dni += nif.charAt(i);
        }

        int dniEntero = Integer.parseInt(dni);
        int posLetra = dniEntero % 23;
        char letraCorrecta = tabla.charAt(posLetra);
        String resultado;
        if (letraIntroducida == letraCorrecta){
            resultado = "El nif introducido es correcto";

        }else 
            resultado = "El nif introducido no es correcto";

            return resultado;

    }


    public static void main (String[]args){
        String nif = obtenerNif();
        System.out.println(comprobar(nif));
    }






    
}
