import java.util.Random;

public class Ejercicio24 {
   public static void execute() {
      final int N_ELEMENTOS = 10;
      int[] v = new int[N_ELEMENTOS];
      int[] p;
      rellenarArray(v);
      mostrarVector(v);
      p = generarSumatorio(v);      
      mostrarVector(p);
   }   

   /**
    * Rellena el array vector con números enteros aleatorios
    * @param vector Array a rellenar
    */
   public static void rellenarArray(int[] vector) {
      for(int i = 0; i < vector.length; i++) {
         vector[i] = alea(0,50);
      }
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
    * Genera un array de la forma
    * v[0] = v[0]
    * v[1] = v[0] + v[1]
    * v[2] = v[0] + v[1] + v[2]
    * ...
    * v[n] = v[0] + v[1] + v[2] + ... + v[n]
    * @param v Array origen
    * @return Array con los sumatorios
    */
   public static int[] generarSumatorio(final int[] v) {
      int suma = 0;
      int[] w = new int[v.length];
      for(int i = 0; i < v.length; i++) {
         suma += v[i];
         w[i] = suma;
      }
      return w;
   }

   /**
    * Muestra el contenido del array pasado como parámetro
    * @param v Array a mostrar
    */
   public static void mostrarVector(final int[] v) {
      System.out.print("[");
      for(int i = 0; i < v.length; i++) {
         if(i!=0) {
            System.out.print(", ");
         }
         System.out.print(v[i]);         
      }
      System.out.println("]");
   }

}