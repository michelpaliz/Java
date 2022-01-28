package libs;

public class div {

    public static double[] div(double[] first, double[] second) {

        int length = first.length < second.length ? first.length : second.length; // decice cual es el mayor
        double[] result = new double[length]; // generamos un array tipo int con su longitud

        for (int i = 0; i < length; i++) {
            result[i] = first[i] / second[i];
        }

        return result;
    }

}
