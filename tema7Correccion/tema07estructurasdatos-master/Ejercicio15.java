public class Ejercicio15 {
   public static void execute() {
      final int N_NUMEROS = 20;
      final int N_COLUMNAS = 20;
      int[] v = new int[N_NUMEROS];
      int num;
      for(int i = 0; i < N_NUMEROS; i++) {
         System.out.print("v[" + i + "] = ");
         num = Main.lector.nextInt();
         Main.lector.nextLine();
         v[i] = num;
      }
      mostrarVectorTabulado(v, N_COLUMNAS);
   }

   /**
    * Muestra el Array v en nColumnas de forma tabulada.
    * @param v Array a mostrar
    * @param nColumnas Número de columnas que mostrará
    */
   public static void mostrarVectorTabulado(final int[] v, int nColumnas) {
      int cont = 0;
      for(int i = 0; i < v.length; i++) {
         System.out.print(v[i] + "\t");
         cont++;
         if(cont == nColumnas) {
            System.out.println("");
            cont = 0;
         }
      }
   }

}