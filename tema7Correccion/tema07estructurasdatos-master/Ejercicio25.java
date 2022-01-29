import java.util.Random;
public class Ejercicio25 {
   public static void execute() {
      final int N_ELEMENTOS = 10;
      int[] v = new int[N_ELEMENTOS];
      int[] p;
      rellenarArray(v);
      mostrarVector(v);
      p = obtenerPares(v);
      if(p != null) {
         mostrarVector(p);
      } else {
         System.out.println("El vector v no tiene elementos pares");
      }
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
    * Genera un vector con los elementos pares presentes en el array v
    * @param v Array origen
    * @return Array con los elementos pares del array v
    */
   public static int[] obtenerPares(final int[] v) {
      int[] w = null;
      int cont = 0;
      int j = 0;
      for(int i = 0; i < v.length; i++) {
         if(v[i] % 2 == 0) {
            cont++;
         }
      }
      if(cont > 0) {
         w = new int[cont];
         for(int i = 0; i < v.length; i++) {
            if(v[i] % 2 == 0) {
               w[j] = v[i];
               j++;
            }
         }
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