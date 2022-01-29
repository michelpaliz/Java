import java.util.Arrays;
import java.util.Random;

public class Ejercicio19 {
   public static void execute() {
      final int N_NUMEROS = 100;
      int[] v = new int[N_NUMEROS];
      int num;
      //Generamos el array de 100 números aleatorios
      for(int i = 0; i < N_NUMEROS; i++) {
         num = alea(0, 100);
         v[i] = num;
      }
      //Imprimimos el array
      System.out.println(Arrays.toString(v));
      //Mostramos los que son múltiplos de 5
      imprimirMultiplesDeCinc(v);
      //Mostramos los que son múltiplos de 10
      imprimirMultiplesDeDeu(v);
      //Mostramos los que son 0
      imprimirValorsZero(v);
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
    * Muestra los valores del array v que son igual a 0
    * @param v Array que contiene los valores a buscar
    */
   public static void imprimirValorsZero(final int[] v) {
      System.out.print("Son 0 = [ ");
      for(int i = 0; i < v.length; i++) {
         if(v[i] == 0) {
            System.out.print(v[i] + " ");
         }
      }
      System.out.println("]");
   }
   /**
    * Muestra los elementos del array que son múltiplos de 5
    * @param v Array que contiene los valores a buscar
    */
   public static void imprimirMultiplesDeCinc(final int[] v) {
      System.out.print("Múltiplos de 5 = [ ");
      for(int i = 0; i < v.length; i++) {
         if(v[i] % 5 == 0) {
            System.out.print(v[i] + " ");
         }
      }
      System.out.println("]");
   }
   //Lo ideal hubiera sido un método que le pasáramos como parámetro
   //el múltiplo a buscar, de esta forma con un método valdría para 
   //los múltiplos de 5 y de 10. Pero el ejercicio lo pide expresamente
   //en métodos separados. 
   /**
    * Muestra los elementos del array que son múltiplos de 10
    * @param v Array que contiene los valores a buscar
    */
   public static void imprimirMultiplesDeDeu(final int[] v) {
      System.out.print("Múltiplos de 10 = [ ");
      for(int i = 0; i < v.length; i++) {
         if(v[i] % 10 == 0) {
            System.out.print(v[i] + " ");
         }
      }
      System.out.println("]");
   }
}