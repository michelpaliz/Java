import java.util.Random;

public class Ejercicio23 {
   public static void execute() {
      final int N_ELEMENTOS = 10;
      double[] v = new double[N_ELEMENTOS];
      double[] p;
      rellenarArray(v);
      mostrarVector(v);
      p = ordenInverso(v);
      mostrarVector(p);
   }
   /**
    * Rellena el array vector con números reales aleatorios
    * @param vector Array a rellenar
    */
   public static void rellenarArray(double[] vector) {
      for(int i = 0; i < vector.length; i++) {
         vector[i] = alea(0,50);
      }
   }

   /**
    * Genera un array a partir del contenido del array vector cuyo
    * contenido es el mismo que vector pero en orden inverso
    * @param vector Array original
    * @return Array invertido
    */
   public static double[] ordenInverso(final double[] vector) {
      int j = 0;
      double[] p = new double[vector.length];
      for(int i = vector.length - 1; i >= 0; i--) {
         p[j] = vector[i];
         j++;
      }
      return p;
   }
   /**
    * Genera un número aleatorio real entre min y max
    * @param min Número mínimo a generar
    * @param max Número máximo a generar
    * @return Número aleatorio generado
    */
   public static double alea(double min, double max) {
      Random r = new Random();
      return min + (max - min) * r.nextDouble();
   }

   /**
    * Muestra el contenido del array pasado como parámetro
    * @param v Array a mostrar
    */
   public static void mostrarVector(final double[] v) {
      System.out.print("[");
      for(int i = 0; i < v.length; i++) {
         if(i!=0) {
            System.out.print(", ");
         }
         System.out.printf("%.2f",v[i]);         
      }
      System.out.println("]");
   }
}