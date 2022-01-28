package libs;

public class factorial {

    public static int[] arrayFactorial(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                a[i] += b[j];
            }
        }
        return a;
    }

}
