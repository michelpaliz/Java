public class Ejercicio17 {
   public static void execute() {
      float[] v;
      int n;
      float estatura;
      float suma = 0;
      float media;
      System.out.print("Cantidad de estaturas: ");
      n = Main.lector.nextInt();
      Main.lector.nextLine();
      v = new float[n];
      //Solicitamos las estaturas 
      for(int i = 1; i <= n; i++) {
         System.out.print("Estatura " + i + ": ");
         estatura = Main.lector.nextFloat();
         Main.lector.nextLine();
         /* Como el bucle empieza en 1, tenemos que restarle 1
         ya que el vector empieza en 0. */
         v[i-1] = estatura;
         suma += estatura;
      }
      //Calculamos la media
      media = suma/n;

      System.out.println("Mitjana: " + media);
      mostrarMayoresQue(v, media);
   }

   /**
    * Muestra los elementos del Array v que son mayores que x
    * @param v Array a buscar
    * @param x valor a partir del cual se mostrarán
    */
   public static void mostrarMayoresQue(final float[] v, float x) {
      for(int i = 0; i < v.length; i++) {
         if(v[i] > x) {
            System.out.print(v[i] + " ");
         }
      }
   }
}