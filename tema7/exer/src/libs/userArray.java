package libs;

// import java.util.Arrays;
import java.util.Scanner;

public class userArray {

    public static Scanner myInput = new Scanner(System.in);
    public static final String message = "Inserta una secuencia de numeros";

    public static double[] doubleArray(double a[]) {

        System.out.println(message);

        for (int i = 0; i < a.length; i++) {
            System.out.print("array[" + i + "] = ");
            a[i] = myInput.nextDouble();
            myInput.nextLine();
        }
        return a;
        // return (Arrays.toString(a));
    }

    public static int[] intArray(int a[]) {

        System.out.println(message);

        for (int i = 0; i < a.length; i++) {
            System.out.print("array[" + i + "] = ");
            a[i] = myInput.nextInt();
            myInput.nextLine();
        }
        return a;
        // return (Arrays.toString(a));
    }

    public static void scannerInt(int number, String message) {

        // number = myInput.nextInt();
        // myInput.nextLine();
        number = Integer.parseInt(myInput.nextLine());

    }

}
