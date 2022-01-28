package libs;

import java.util.Arrays;

public class add {

    /**
     * @param first  first array
     * @param second second array
     * @return
     */

    public static int[] add(int[] first, int[] second) {

        int length = first.length < second.length ? first.length : second.length; // decice cual es el mayor
        int[] result = new int[length]; // generamos un array tipo int con su longitud

        for (int i = 0; i < length; i++) {
            result[i] = first[i] + second[i];
        }

        return result;
    }

    /**
     * @param first  first array
     * @param second second array
     * @return
     */

    public static double[] add(double first[], double second[]) {

        int length = first.length < second.length ? first.length : second.length; // decice cual es el mayor
        double[] result = new double[length]; // generamos un array tipo double con su longitud

        for (int i = 0; i < length; i++) {
            result[i] = first[i] + second[i];
        }

        return result;
    }

    public static void sumaTotal(double a[], double b[]) {
        double sumA = 0;
        double sumB = 0;
        double divA = 0;
        double divB = 0;

        for (int i = 0; i < a.length; i++) {
            sumA = sumA + a[i];
        }

        for (int j = 0; j < b.length; j++) {
            sumB = sumB + b[j];
        }

        double c = sumA + sumB; // we create our third array
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("Sum of the elements of both arrays are :" + (c));

    }

}
