import java.util.Arrays;
import java.util.Random;

public class Ejercicio18 {
   public static void execute() {
      final int N_NUMEROS = 10;
      int[] v1 = new int[N_NUMEROS];
      int[] v2 = new int[N_NUMEROS];
      int[] suma;
      double[] division;
      int num1, num2;
      //Generamos los 2 Arrays con datos aleatorios
      for(int i = 0; i < N_NUMEROS; i++) {
         num1 = alea(1, 10);
         num2 = alea(1, 10);  
         v1[i] = num1;
         v2[i] = num2;
      }
      //Generamos el vector suma a partir de la suma de los otros dos
      suma = suma(v1, v2);
      //Generamos el vector división a partir de la división de los otros dos
      division = division(v1, v2);
      //Mostramos todos los vectores
      System.out.println("v1 = " + Arrays.toString(v1));
      System.out.println("v2 = " + Arrays.toString(v2));
      System.out.println("Suma =  " + Arrays.toString(suma));
      System.out.println("División =  " + Arrays.toString(division));
   }
   /**
    * Genera un número entero aleatorio entre min y max
    * @param min Número mínimo a ser generado
    * @param max Número máximo a ser generado
    * @return Número entero aleatorio generado
    */
   public static int alea(int min, int max) {
      Random r = new Random();
      return r.nextInt(max - min + 1) + min;
   }
   /**
    * Suma cada elemento de v1 con su correspondiente en v2
    * @param v1 Primer Array 
    * @param v2 Segundo array
    * @return Devuelve un nuevo vector con la suma de v1 y v2
    */
   public static int[] suma(final int[] v1, final int[] v2) {
      int[] sum = new int[v1.length];
      if(v1.length != v2.length) {
         System.out.println("Error no se pueden sumar vectores de diferente tamaño.");
         return sum;
      }
      for(int i = 0; i < v1.length; i++) {
         sum[i] = v1[i] + v2[i];
      }
      return sum;
   }
   /**
    * Divide cada elemento de v1 con su correspondiente en v2
    * @param v1 Primer Array 
    * @param v2 Segundo array
    * @return Devuelve un nuevo vector con la división de v1 y v2
    */
   public static double[] division(final int[] v1, final int[] v2) {
      double[] div = new double[v1.length];
      if(v1.length != v2.length) {
         System.out.println("Error no se pueden dividir vectores de diferente tamaño.");
         return div;
      }
      for(int i = 0; i < v1.length; i++) {
         div[i] = (float)v1[i] / v2[i];
      }
      return div;
   }
}