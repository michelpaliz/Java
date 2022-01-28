package libs;

import java.util.Random;

public class randArray {

    public static Random r = new Random();

    public static int random(int min, int max) {

        return r.nextInt(max - min + 1) + min;

    }

    public static double random(double min, double max) {

        return r.nextDouble() * (max - min + 1) + min;

    }

    public static double randomDouble(double rangeMin, double rangeMax) {
        double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        return randomValue;
    }

    public static int randomGeneratorMath(int min, int max) {
        int a;
        return a = (int) (Math.random() * (max - min + 1)) + min;

    }

    // public static double randomGeneratorMathDouble(int min,int max) {
    // int a;
    // return a = (double) (Math.random() * (max - min + 1)) + min;

    // }

    // For arrays

    public static double[] randomGenerator(double a[], int min, int max) {
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextDouble() * (max - min + 1) + min;
        }

        return a;

    }

    public static int[] randomGenerator(int a[], int min, int max) {
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt() * (max - min + 1) + min;
        }

        return a;

    }

    public static int[] randomGeneratorMath(int a[], int min, int max) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (max - min + 1)) + min;
        }

        return a;

    }

}
