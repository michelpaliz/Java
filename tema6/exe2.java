import java.util.Scanner;
public class exe2{

    public static final double pi  = 3.14159265359;


    public static double longitud (double radio ){
        double log;
        log  =  2 * pi * radio;
        return log;

    }

    public static  double area (double radio){
        double area;
        area  = Math.pow(radio,2);
        return area;

    }


    
    public static void main (String []args) {

        //Ejercicio2
            //Escribe un programa que calcule el área y la longitud de una circunferencia en función del radio
            // (leído desde teclado). Hay que escribir un método para calcular el área y otro para la longitud.
        //variables
        double area;
        double radio;
        double pi = 3.14159265359;

        // L = 2 · π · r
        // El área de un círculo es pi multiplicado por el radio al cuadrado (A = π r²).

        Scanner myInput = new Scanner(System.in);
        System.out.println("Inserta el radio del circulo");
        radio = myInput.nextDouble();
        System.out.println("Este es el radio del circulo " + radio);

        

        System.out.println("Este es la log " + longitud(radio));
        System.out.println("Este es el area " + area(radio));


    }


}
