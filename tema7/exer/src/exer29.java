import java.util.Random;
import libs.matrizlib;
import libs.randArray;
import libs.format;
import java.util.Arrays;

public class exer29 {

    public static final int ROW_VALUE = 3;
    public static final int COL_VALUE = 4;

    public static final int MAX_VALUE = 10;
    public static final int MIN_VALUE = 1;
    public static final int NUM = 10;

    public static int[] addInt(int[] first, int[] second) {
        int length = first.length < second.length ? first.length : second.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = first[i] + second[i];
        }
        return result;
    }

    public static String[][] add(String[][] first, String[][] second) {
        int length = first.length < second.length ? first.length : second.length;
        String[][] result = new String[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }
        return result;
    }

    public static String alumno(String[] concepto) {
        String palabra = "MOD";
        for (int i = 0; i < concepto.length; i++) {
            concepto[i] = palabra + " " + (i + 1);
        }
        return Arrays.toString(concepto);
    }

    public static void main(String[] args) {

        int i = 0;
        int j = 0;
        Random r = new Random();

        int m[][] = new int[ROW_VALUE][COL_VALUE];
        double a[][] = new double[3][3];
        String c[] = new String[ROW_VALUE];
        String d[][] = new String[ROW_VALUE][COL_VALUE];
        // int[] numeros = new int[NUM];
        // int[] repeticiones = new int[MAX_VALUE - MIN_VALUE + 1];

        System.out.println("*PUNTACIONES*\n");

        System.out.println(alumno(c));

        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                // a[i][j] = randArray.randomGeneratorMath(1, 10);
                a[i][j] = format.withBigDecimal(randArray.randomDouble(0, 10), 2);
                // System.out.print(a[i][j] + " ");
                String value;
                value = a[i][j] + "";

                value += d;

                // String value = a[i][j] + "";
                // **NOTAS */
                // String format = "%-20s %s";
                String format = "%-20s";
                System.out.printf(format, value);
            }
            System.out.println();

        }

    }

}
