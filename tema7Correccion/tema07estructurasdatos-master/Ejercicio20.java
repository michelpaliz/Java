import java.util.Arrays;
import java.util.Random;

public class Ejercicio20 {
   public static void execute() {
      final int N_NUMEROS = 10;
      int[] v = new int[N_NUMEROS];
      int x;
      int pos;
      //Generamos el array de números aleatorios
      for(int i = 0; i < N_NUMEROS; i++) {
         v[i] = alea(1, 10);
      }
      //Imprimimos el array
      System.out.println("Array " + Arrays.toString(v));
      //Solicitamos el elemento a buscar
      System.out.print("Indica el elemento a buscar: ");
      x = Main.lector.nextInt();
      Main.lector.nextLine();
      //Buscamos el elemento
      pos = buscar(v, x);
      //Si pos es mayor que 0 significa que el elemento está en el vector
      //y pos indica la posición donde se encuentra
      if(pos >= 0) {
         System.out.println("El elemento " + x + " está en la posición " + pos);
      } else {
         //Sino, (-1) no está en el vector
         System.out.println("El elemento " + x + " no está en el vector");
      }
   }

   /**
    * Busca si un determinado elemento se encuentra en el vector.
    * @param v El array 
    * @param x El valor a buscar
    * @return Si el elemento se encuentra en el vector devuelve la posición 
    * de la primera aparición en el vector. En caso negativo devuelve -1 
    */
   public static int buscar(final int[] v, int x) {
      for(int i = 0; i < v.length; i++) {
         if(v[i] == x) {
            return i;
         }
      }
      return -1;
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
}