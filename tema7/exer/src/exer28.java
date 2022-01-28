import java.util.Random;

public class exer28 {

    public static final int MIN_VALUE = (int) 'A';
    public static final int MAX_VALUE = (int) 'Z';
    public static final int NUM_LETTER = 500;

    public static void main(String[] args) {
        int[] letras = new int[NUM_LETTER];
        int[] repeticiones = new int[MAX_VALUE - MIN_VALUE + 1];
        Random r = new Random();

        for (int i = 0; i < repeticiones.length; i++) {
            repeticiones[i] = 0;
        }

        for (int i = 0; i < letras.length; i++) {
            char letra = (char) (r.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE);
            letras[i] = letra;
            repeticiones[letra - MIN_VALUE]++;

        }

        for (int i = 0; i < repeticiones.length; i++) {
            System.out.printf("%c --> %d\n", (char) (i + MIN_VALUE), repeticiones[i]);
        }

    }

}
