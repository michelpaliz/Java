import java.util.Random;

public class Ejercicio27 {
   public static void execute() {
      final int N_ELEMENTOS_V = 50;
      final int N_ELEMENTOS_P = 20;
      int[] v = new int[N_ELEMENTOS_V];
      int[] p = new int[N_ELEMENTOS_P];
      int[][] m;
      rellenarArray(v);
      rellenarArray(p);      
      mostrarVector(v);
      mostrarVector(p);
      m = multiplica(v, p);
      mostrarMatriz(m);
   }

   /**
    * Rellena el array vector con números enteros aleatorios
    * @param vector Array a rellenar
    */
   public static void rellenarArray(int[] vector) {
      for(int i = 0; i < vector.length; i++) {
         vector[i] = alea(1,10);
      }
   }

   /**
    * Genera un nuevo vector cuyo contenido es el resultado de multiplicar 
    * cada elemento del vector v con su correspondiente del vector p
    * @param v Primer array
    * @param p Segundo array
    * @return Array con la multiplicación de v y p
    */
   public static int[][] multiplica(final int[] v, final int[] p) {
      int[][] m = new int[v.length][p.length];
      for(int i = 0; i < v.length;i++) {
         for(int j = 0; j < p.length; j++) {
            m[i][j] = v[i]*p[j];
         }
      }
      return m;
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
    * Muestra el contenido del array v
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

   /**
    * Muestra el contenido de la matriz m
    * @param m Matriz a mostrar
    */
   public static void mostrarMatriz(final int[][] m) {
      for(int i = 0; i < m.length; i++) {
         System.out.print("Fila " + i + ": ");
         for(int j = 0; j < m[i].length; j++) {
            if(j!=0) {
               System.out.print(", ");    
            }   
            System.out.print(m[i][j]);
         }
         System.out.println("");
      }
   }
}