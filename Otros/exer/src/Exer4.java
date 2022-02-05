import java.util.Random;
import java.util.Scanner;

import java.util.Arrays;
// math imports
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exer4 {

    // *Global variables
    public static final int PRODUCTOS = 5;
    public static final int MESES = 5;
    public static final double MIN_NUM = 0;
    public static final double MAX_NUM = 100;
    public static Scanner myInput = new Scanner(System.in);
    public static int user;

    public static double alea(double min, double max) {
        Random r = new Random();
        return min + (max - min) * r.nextDouble();
    }

    /**
     * >Vamos a rellenar la matriz con importes aleatorios
     */
    public static void rellenarMatriz(double[][] m) {

        for (int i = 0; i < m.length; i++) {
            // System.out.println("Introduce el importe");
            // user = Integer.parseInt(myInput.nextLine());
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = alea(MIN_NUM, MAX_NUM);
            }
        }

    }

    public static enum Mes {
        ENERO, FEBREO, MARZO, ABRIL, MAYO
    }

    public static double[] min_row(double[][] n) {

        double[] result = new double[n.length];

        for (int i = 0; i < n.length; i++) {
            double min = Integer.MAX_VALUE; // initial min with MAX int value
            for (int j = 0; j < n[i].length; j++) {

                if (min > n[i][j]) // if element smaller than min
                {
                    min = n[i][j]; // assign a new min value
                }

            }
            result[i] = min; // save the min for the row

        }

        return result;
    }

    public static int superanMedia(final double[][] notas, double media, int modulo) {
        int cont = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[modulo][i] > media) {
                cont++;
            }
        }
        return cont;
    }

    public static void mostrarTabla(final double[][] m) {

        // Mediante las sumas de las variables sumaProducto y sumaMes
        double[] totalMediaProducto = new double[MESES];// *Matriz creada para el importe total de los importes
                                                        // mensuales
        double[] totalMediaMes = new double[MESES];
        // variables para realizar las operaciones de arriba
        double sumaProducto = 0;// !variable para la suma por fila
        int sumaMes = 0;// !variable para la suma por columna
        double maxProducto[] = new double[PRODUCTOS];
        double minProducto[] = new double[PRODUCTOS];
        // +EMPEZAMOS HACER LAS OPERACIONES
        int contador = 0;
        String formato = "\t|%.3S|";
        while (contador < MESES) {

            if (contador < MESES) {
                System.out.printf("MESES \t\t|%.3S|", "Enero");
                contador++;
                if (contador < MESES) {
                    System.out.printf(formato, "Febrero");
                    contador++;
                }
                if (contador < MESES) {
                    System.out.printf(formato, "Marzo");
                    contador++;
                }
                if (contador < MESES) {
                    System.out.printf(formato, "Abril");
                    contador++;
                }
                if (contador < MESES) {
                    System.out.printf(formato, "Mayo");
                    contador++;
                }
            }
        }

        System.out.printf("\t|%-4s| \t|%-4s| |%4s| |%4s| |%4s|  \n", "Suma", "Media", "Maxima", "Minimo",
                "SuperanMedia");
        for (int i = 0; i < m.length; i++) {
            System.out.printf("Producto " + (i + 1) + "\t");
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%05.2f$  ", m[i][j]); /// el cero de adelante define el numero de ceros que se
                                                         /// tendran que poner en caso de llegar a la longitud 4= (5-1)
                // *operaciones
                if (maxProducto[i] < m[i][j]) {
                    maxProducto[i] = m[i][j];// rellenamos el array
                }

                sumaProducto += ((m[i][j]));
                totalMediaProducto[j] = 0;
                totalMediaProducto[j] += (m[i][j]);

            }
            double media = sumaProducto / PRODUCTOS;
            // !imprimos por pantalla las filas y columnas (SUMA,MEDIA,MAXIMO,SUPERANMEDIA)
            System.out.printf("%-2.2f$\t %-2.2f$\t", sumaProducto, media);
            sumaProducto = 0;// Resetemos la suma a 0
            // Calcular el maximo de las filas del array
            double result = 0;
            double resul1 = 0;
            for (double max = 0; max < PRODUCTOS; max++) {
                result = maxProducto[i];
            }
            // Calcular el minimo
            for (int x = 0; x < min_row(m).length; x++) {
                minProducto = min_row(m);
                resul1 = minProducto[i];
            }
            // imprimos medias superadas por productos
            // double nProductos = 0;
            int cont = 0;
            // System.out.println("esto es total media" +
            // Arrays.toString(totalMediaProducto));
            for (int z = 0; z < MESES; z++) {
                if (totalMediaProducto[z] > media) {
                    cont++;
                }
            }

            System.out.printf("%05.2f$\t %05.2f$ (%d) \n", result, resul1, cont);

            System.out.println("Esto es media" + media);
        }

        // for (double element : min_row(m)) {
        // System.out.printf("%.2f\n", element);
        // }

    }

    public static void main(String[] args) {

        // Con random
        double[][] importe = new double[PRODUCTOS][MESES]; // ** Matriz creada para poner los importes

        rellenarMatriz(importe);

        mostrarTabla(importe);

    }

}
