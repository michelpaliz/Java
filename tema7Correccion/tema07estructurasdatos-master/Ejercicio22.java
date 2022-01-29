public class Ejercicio22 {
   public static void execute() {
      final int N_ELEMENTOS = 10;
      double[] p = new double[N_ELEMENTOS];
      double[] s = new double[N_ELEMENTOS];

      leerElementos(p);
      mayoresQue(p, s, 10);
      mostrarVector(s);

   }

   /**
    * Solicita al usuario que introduza números reales para el array v
    * 
    * @param v Array en el que se guardarán los datos introducidos por el usuario
    */
   public static void leerElementos(double[] v) {
      System.out.println("Introduce los " + v.length + " elementos del vector");
      for (int i = 0; i < v.length; i++) {
         System.out.print("v[" + i + "] = ");
         v[i] = Main.lector.nextDouble();
         Main.lector.nextLine();
      }
   }

   /**
    * Genera un array s con los valores de p que son mayores que num
    * 
    * @param p   Array en el que se buscan los valores
    * @param s   Array en el que se guardan los elementos de p que son mayores
    *            que num
    * @param num Número que marca el valor a partir del cual se guardaran los
    *            valores en el array s
    */
   public static void mayoresQue(final double[] p, double[] s, int num) {
      for (int i = 0; i < p.length; i++) {
         if (p[i] > num) {
            s[i] = p[i];
         } else {
            s[i] = -1;
         }
      }
   }

   /**
    * Muestra por pantalla el contenido del Array v
    * 
    * @param v Array a mostrar
    */
   public static void mostrarVector(final double[] v) {
      System.out.print("[");
      for (int i = 0; i < v.length; i++) {
         if (i != 0) {
            System.out.print(", ");
         }
         System.out.printf("%.2f", v[i]);
      }
      System.out.println("]");
   }
}