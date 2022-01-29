import java.util.Random;

public class Ejercicio16 {
   public static void execute() {
      final int N_NOTAS = 30;
      double[] v = new double[N_NOTAS];
      double num;
      double sumaCinc = 0, sumaTotal = 0;
      int nCinc = 0;

      //Generamos las notas aleatorias de los alumnos
      for(int i = 0; i < N_NOTAS; i++) {
         num = alea(0, 10);
         v[i] = num;
         //Acumulamos los que suman más de 5 para calcular la media de los mayores que 5
         if(num >= 5) {
            sumaCinc += num;
            nCinc++;
         }
         //Acumulados todos para la media general
         sumaTotal += num;
      }
      //Calculamos y mostramos las medias
      System.out.printf("Mitjana de notes >= 5: %.2f\n", sumaCinc/nCinc);
      System.out.printf("Mitjana total: %.2f\n" , sumaTotal/N_NOTAS);
   }
   /**
    * Genera un número real aleatorio entre min y max
    * @param min Valor mínimo generado
    * @param max Valor máximo generado
    * @return Número real aleatorio
    */
   public static double alea(double min, double max) {
      Random r = new Random();
      return min + (max - min) * r.nextDouble();
   }

}