import java.util.Random;

public class Ejercicio29 {
   public static final int N_ALUMNOS = 5;
   public static final int N_MODULOS = 3;
   public static final double MIN_NUM = 0;
   public static final double MAX_NUM = 10;

   public static void execute() {
      double[][] notas = new double[N_ALUMNOS][N_MODULOS];
      rellenarMatriz(notas);
      mostrarNotas(notas);
   }

   /**
    * Rellena la matriz con notas aleatorias.
    * 
    * @param m La matriz a rellenar
    */
   public static void rellenarMatriz(double[][] m) {
      for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[i].length; j++) {
            m[i][j] = alea(MIN_NUM, MAX_NUM);
         }
      }
   }

   /**
    * Muestra los notas y las estadísticas por pantalla
    * 
    * @param m La notas de los alumnos. Cada fila es un alumno y cada columna un
    *          módulo
    */
   public static void mostrarNotas(final double[][] m) {
      double sumAlumno;
      double[] maxModulo = new double[N_MODULOS];
      double[] sumModulo = new double[N_MODULOS];
      int nAlumnos;
      System.out.print("          ");
      for (int i = 1; i <= N_MODULOS; i++) {
         System.out.printf("\t%9s %d", "MOD", i);
      }
      System.out.printf("\t%10s\n", "Media");
      for (int i = 0; i < m.length; i++) {
         System.out.print("Alumno " + (i + 1) + " ");
         sumAlumno = 0;
         for (int j = 0; j < m[i].length; j++) {
            System.out.printf("\t%10.2f", m[i][j]);
            sumAlumno += m[i][j];
            if (maxModulo[j] < m[i][j]) {
               maxModulo[j] = m[i][j];
            }
            sumModulo[j] += m[i][j];
         }
         // Imprimimos media del alumno
         System.out.printf("\t%10.2f\n", sumAlumno / N_MODULOS);
      }

      // Imprimimos notas máximas por módulos
      System.out.printf("Nota máxima");
      for (int i = 0; i < N_MODULOS; i++) {
         System.out.printf("\t%10.2f", maxModulo[i]);
      }
      System.out.println("");

      // Imprimimos medias por módulos
      System.out.print("Media (nAlum)");
      for (int i = 0; i < N_MODULOS; i++) {
         sumModulo[i] = sumModulo[i] / N_ALUMNOS;
         nAlumnos = superanMedia(m, sumModulo[i], i);
         System.out.printf("\t%10.2f (%d)", sumModulo[i], nAlumnos);
      }
      System.out.println("");
   }

   /**
    * Genera un número real aleatorio entre un min y un max
    * 
    * @param min
    * @param max
    * @return número aleatorio
    */
   public static double alea(double min, double max) {
      Random r = new Random();
      return min + (max - min) * r.nextDouble();
   }

   /**
    * Calcula cuantos alumnos superan la media indicada en el módulo indicado
    * 
    * @param notas  Matriz de notas
    * @param media  La media
    * @param modulo La posición (columna) donde se encuentra el módulo
    * @return número de alumnos que superan la media en el módulo indicado
    */
   public static int superanMedia(final double[][] notas, double media, int modulo) {
      int cont = 0;
      for (int i = 0; i < notas.length; i++) {
         if (notas[i][modulo] > media) {
            cont++;
         }
      }
      return cont;
   }
}