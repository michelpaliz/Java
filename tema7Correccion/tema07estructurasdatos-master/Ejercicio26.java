import java.util.Random;

public class Ejercicio26 {
   public static final int MIN_NUM = 0;
   public static final int MAX_NUM = 50;
   public static final int FILAS = 4;
   public static final int COLUMNAS = 8;

   public static void execute() {
      int[][] m = new int[FILAS][COLUMNAS];
      int fila, columna;
      boolean validado;
      rellenarMatriz(m);
      mostrarMatriz(m);
      System.out.println("");
      mostrarMatriz(traspuesta(m));
      mostrarMatrizConTotal(m);
      System.out.println("El valor mínimo es " + min(m));
      System.out.println("El valor máximo es " + max(m));
      System.out.println("La media es " + media(m));
      System.out.println("Indica el elemento a buscar.");
      do {
         System.out.print("Fila: ");
         fila = Main.lector.nextInt();
         Main.lector.nextLine();
         validado = fila >= 0 && fila < FILAS;
         if (!validado) {
            System.out.println("Debe introducir un valor entre 0 y " + (FILAS - 1));
         }
      } while (!validado);
      do {
         System.out.print("Columna: ");
         columna = Main.lector.nextInt();
         Main.lector.nextLine();
         validado = columna >= 0 && columna < COLUMNAS;
         if (!validado) {
            System.out.println("Debe introducir un valor entre 0 y " + (COLUMNAS - 1));
         }
      } while (!validado);
      System.out.println("m[" + fila + "][" + columna + "] = " + m[fila][columna]);

      do {
         System.out.print("Fila: ");
         fila = Main.lector.nextInt();
         Main.lector.nextLine();
         validado = fila >= 0 && fila < FILAS;
         if (!validado) {
            System.out.println("Debe introducir un valor entre 0 y " + (FILAS - 1));
         }
      } while (!validado);
      mostrarFila(m, fila);

      do {
         System.out.print("Columna: ");
         columna = Main.lector.nextInt();
         Main.lector.nextLine();
         validado = columna >= 0 && columna < COLUMNAS;
         if (!validado) {
            System.out.println("Debe introducir un valor entre 0 y " + (COLUMNAS - 1));
         }
      } while (!validado);
      mostrarColumna(m, columna);

      registraTotales(m);
      mostrarMatriz(m);
   }

   /**
    * Rellena la matriz m con números enteros aleatorios
    * 
    * @param m Matriz a rellenar
    */
   public static void rellenarMatriz(int[][] m) {
      for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[i].length; j++) {
            m[i][j] = alea(MIN_NUM, MAX_NUM);
         }
      }
   }

   /**
    * Muestra el contenido de la matriz m
    * 
    * @param m Matriz a mostrar
    */
   public static void mostrarMatriz(final int[][] m) {
      for (int i = 0; i < m.length; i++) {
         System.out.print("Fila " + i + ": ");
         for (int j = 0; j < m[i].length; j++) {
            if (j != 0) {
               System.out.print(", ");
            }
            System.out.print(m[i][j]);
         }
         System.out.println("");
      }
   }

   /**
    * Muestra la matriz m con un total por fila
    * 
    * @param m Matriz a mostrar
    */
   public static void mostrarMatrizConTotal(final int[][] m) {
      int suma;
      for (int i = 0; i < m.length; i++) {
         suma = 0;
         System.out.print("Fila " + i + ": ");
         for (int j = 0; j < m[i].length; j++) {
            if (j != 0) {
               System.out.print(", ");
            }
            System.out.print(m[i][j]);
            suma += m[i][j];
         }
         System.out.print("\t Total = " + suma);
         System.out.println("");
      }
   }

   /**
    * Muestra la fila indicada de la matriz m
    * 
    * @param m    Matriz
    * @param fila Fila a mostrar
    */
   public static void mostrarFila(final int[][] m, int fila) {
      System.out.print("m[" + fila + "] = [");
      for (int i = 0; i < m[fila].length; i++) {
         if (i != 0) {
            System.out.print(", ");
         }
         System.out.print(m[fila][i]);
      }
      System.out.println("]");
   }

   /**
    * Muestra la columna indicada de la matriz
    * 
    * @param m       Matriz a mostrar
    * @param columna Columna a mostrar
    */
   public static void mostrarColumna(final int[][] m, int columna) {
      System.out.print("m[?][" + columna + "] = [");
      for (int i = 0; i < m.length; i++) {
         if (i != 0) {
            System.out.print(", ");
         }
         System.out.print(m[i][columna]);
      }
      System.out.println("]");
   }

   /**
    * Devuelve la matriz traspuesta de la matriz indicada como parámetro
    * 
    * @param m Matriz origen
    * @return Matriz traspuesta
    */
   public static int[][] traspuesta(final int[][] m) {
      int[][] t = new int[m[0].length][m.length];
      for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[i].length; j++) {
            t[j][i] = m[i][j];
         }
      }
      return t;
   }

   /**
    * Obtiene el valor máximo de la matriz m
    * 
    * @param m Matriz a buscar
    * @return Valor máximo de la matriz
    */
   public static int max(final int[][] m) {
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[i].length; j++) {
            if (m[i][j] > max) {
               max = m[i][j];
            }
         }
      }
      return max;
   }

   /**
    * Obtiene el valor mínimo de la matriz m
    * 
    * @param m Matriz a buscar
    * @return Valor mínimo de la matriz
    */
   public static int min(final int[][] m) {
      int min = Integer.MAX_VALUE;
      for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[i].length; j++) {
            if (m[i][j] < min) {
               min = m[i][j];
            }
         }
      }
      return min;
   }

   /**
    * Calcula la media aritmética de los elementos de la matriz m
    * 
    * @param m Matriz origen
    * @return Media aritmética de la matriz
    */
   public static float media(final int[][] m) {
      int sum = 0;
      int cont = 0;
      for (int i = 0; i < m.length; i++) {
         for (int j = 0; j < m[i].length; j++) {
            sum += m[i][j];
            cont++;
         }
      }
      return (float) sum / cont;
   }

   /**
    * Genera un número entero aleatorio entre min y max
    * 
    * @param min Número mínimo a ser generado
    * @param max Número máximo a ser generado
    * @return Número entero aleatorio generado
    */
   public static int alea(int min, int max) {
      Random r = new Random();
      return r.nextInt(max - min + 1) + min;
   }

   /**
    * Calcula la suma por fila y la guarda en la última columna
    * 
    * @param m Matriz origen
    */
   public static void registraTotales(int[][] m) {
      int sum;
      for (int i = 0; i < m.length; i++) {
         sum = 0;
         for (int j = 0; j < m[i].length; j++) {
            if (j == m[i].length - 1) {
               m[i][j] = sum;
            } else {
               sum += m[i][j];
            }
         }
      }
   }
}