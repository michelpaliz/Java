package libs;

public class inverse {

    public static int[] inverseInt(int a[]) {

        for (int i = 0; i < a.length; i++) {
            a[i] = a.length - i;

        }

        return a;

    }
}
