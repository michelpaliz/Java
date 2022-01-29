public class Ejercicio13 {
   public static void execute() {
      final int N_NUMEROS = 10;
      int[] v = new int[N_NUMEROS];
      int num;
      int sum = 0;
      for(int i = 0; i < N_NUMEROS; i++) {
         System.out.print("v[" + i + "] = ");
         num = Main.lector.nextInt();
         Main.lector.nextLine();
         v[i] = num;
         sum += num;
      }
      mostrarVector(v);
      System.out.println("Mitjana: " + (float)sum / N_NUMEROS);
   }

   /**
    * Escribe en pantalla el contenido de un array
    * @param v Array a mostrar
    */
   public static void mostrarVector(final int[] v) {
      System.out.print("[ ");
      for(int i = 0; i < v.length; i++) {
         System.out.print(v[i] + " ");
      }
      System.out.println("]");
   }
}