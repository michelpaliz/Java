public class Ejercicio14 {

   public static void execute() {
      final int N_NUMEROS = 10;
      char[] v = new char[N_NUMEROS];
      char c;
      for(int i = 0; i < N_NUMEROS; i++) {
         System.out.print("v[" + i + "] = ");
         c = Main.lector.nextLine().charAt(0);
         v[i] = c;
      }
      mostrarVector(v, true);
      mostrarVector(v, false);
   }

   /**
    * Muestra los elementos del array v que ocupan una posición par
    * si par es TRUE, o los elementos que ocupan una posición impar 
    * si par es FALSE.
    * @param v Array a mostrar
    * @param par TRUE se muestran los elementos de posición par.
    * FALSE se muestran los elementos de posición impar.
    */
   public static void mostrarVector(final char[] v, boolean par) {
      System.out.print("[ ");
      int inicio = par ? 0 : 1;
      for(int i = inicio; i < v.length; i += 2) {
        System.out.print(v[i] + " ");
      }
      System.out.println("]");
   }

}