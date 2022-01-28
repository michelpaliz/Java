import libs.multiplo;
import java.util.Arrays;

public class exer25 {

    public static void messageMultiplo(int[] lenght, int multiplo) {

        for (int i = 0; i < a.length; i++) {
            if (lenght[i] % multiplo == 0) {
                System.out.println(lenght[i] + "");
            }
        }

    }

    public static void main(String[] args) {

        int[] a = new int[50];

        System.out.println(Arrays.toString(multiplo.multiploNewArray(a, 2)));

        // int[] a = { 1, 2, 3 };
        // System.out.println(a);
        // int[] b = a;
        // System.out.println(b);
        // a[0] *= 10;
        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(b));
    }

}
