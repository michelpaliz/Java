import java.util.Random;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class Exer4 {

    // *Global variables
    public static final int PRODUCTOS = 5;
    public static final int MESES = 5;
    public static final double MIN_NUM = 0;
    public static final double MAX_NUM = 100;
    public static Scanner myInput = new Scanner(System.in);
    public static int user;

    /*
     * 
     * @param min
     * 
     * @param max
     * 
     * @return
     */
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

    public static void mostrarTabla(final double[][] m) {

        // Mediante las sumas de las variables sumaProducto y sumaMes
        double[] totalPorMes = new double[MESES];// *Matriz creada para el importe total de los importes mensuales
        double[] totalPorProducto = new double[PRODUCTOS];// *Matriz creada para el importe total del los productos
        double[] totalMediaProducto = new double[PRODUCTOS];
        double[] totalMediaMes = new double[MESES];
        // variables para realizar las operaciones de arriba
        double sumaProduto = 0;// !variable para la suma por fila
        int sumaMes = 0;// !variable para la suma por columna
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

        System.out.printf("\t|%-4s| \t|%-4s|  \n", "Suma", "Media");
        for (int i = 0; i < m.length; i++) {
            System.out.printf("Producto " + (i + 1) + "\t");
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%-2.2f$  ", m[i][j]);

                sumaProduto += ((m[0][j] - m[0][0]) * -1);// *Todo Resolver esta linea

            }
            System.out.printf("%-2.2f$\t %-2.2f$  \n", sumaProduto, sumaProduto / PRODUCTOS);

        }

    }

    public static void main(String[] args) {

        // Con random
        double[][] importe = new double[PRODUCTOS][MESES]; // ** Matriz creada para poner los importes

        rellenarMatriz(importe);

        mostrarTabla(importe);

    }

}
