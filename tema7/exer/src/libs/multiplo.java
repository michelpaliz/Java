package libs;

public class multiplo {

    public static String multiplo(int a[], int b) {

        StringBuilder result = new StringBuilder();
        String format = "%.1f\n";

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            if (a[i] % b == 0) {
                result.append(String.format(format, a[i]));
            }
        }

        return result.toString();

    }

    public static String multiplo(double a[], double b) {

        StringBuilder result = new StringBuilder();
        String format = "%.1f\n";

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            if (a[i] % b == 0) {
                result.append(String.format(format, a[i]));
            }
        }

        return result.toString();

    }

    public static int[] multiploNewArray(int a[], int b) {

        int[] newArray = new int[a.length];
        int[] a5;
        int cont = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            if (a[i] % b == 0) {
                newArray[cont] = a[i];
                cont++;

            }
        }

        a5 = new int[cont];
        for (int i = 0; i < cont; i++) {
            a5[i] = newArray[i];
        }

        return a5;

    }

}
