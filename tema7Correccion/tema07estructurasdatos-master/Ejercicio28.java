import java.util.Random;

public class Ejercicio28 {
    /* En Unicode las letras de la A-Z corresponden a números entre 65 y 90 */
    private static final int A = 65;
    /* Sumamos 1 a 90 para tener en cuenta otra letra, si sale el 91 lo 
     * tomaremos como si fuése la Ñ que es el 209 en Unicode */
    private static final int Z = 90;
    /* Valor en Unicode de la letra Ñ */
    private static final int ENYE = 209;

    public static void execute() {
        final int N_ELEMENTOS = 500;      
        char[] v = new char[N_ELEMENTOS];
        rellenarArray(v);
        mostrarVector(v);
        mostrarOcurrencias(v);
    }

    /**
     * Genera un array de carácteres aleatorios.
     * Los carácteres son generados mediante números aleatorios.
     * En Unicode las letras de la A-Z corresponden a números entre 65 y 90
     * La letra Ñ tiene es el número 209 en Unicode 
     * @param vector Vector a rellenar con caracteres
     */
    public static void rellenarArray(char[] vector) {
        int num;
        for(int i = 0; i < vector.length; i++) {
            //65 -> A
            //90 -> Z
            //209 -> Ñ
            //Generamos un número entre 65 y 91
            //De 65 a 90 serán las letras normales A..Z en inglés pero falta la Ñ
            //Si sale el 91 lo tomaremos como si fuése la Ñ que es el 209 en Unicode  
            num = alea(A, Z + 1);
            if(num == Z + 1) {
                num = ENYE;
            }
            vector[i] = (char)num;
        }
    }

    /**
     * Muestra el número de apariciones de cada carácter que hay en el vector
     * @param vector Array con los carácteres
     */
    public static void mostrarOcurrencias(final char[] vector) {
        int[] o = new int[Z + 1 - A + 1];
        int num;
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < vector.length; i++) {
            num = vector[i] - A;
            if(num > Z) {
                num = Z + 1 - A;
            }
            o[num]++;
        }
        for(int i = 0; i < o.length; i++) {
            s.setLength(0);
            num = i + A;
            if(num == Z + 1) {
                num = ENYE; 
            }         
            s.append((char)num).append(" --> ").append(o[i]);
            System.out.println(s.toString());
        }
    }

    /**
     * Muestra el contenido del Array v
     * @param v Array a mostrar
     */
    public static void mostrarVector(final char[] v) {
        System.out.print("[");
        for(int i = 0; i < v.length; i++) {
            if(i!=0) {
                System.out.print(", ");
            }
            System.out.print(v[i]);         
        }
        System.out.println("]");
    }

    /**
     * Genera un número entero aleatorio entre min y max
     * @param min Número mínimo a ser generado
     * @param max Número máximo a ser generado
     * @return Número entero aleatorio generado
     */
    public static int alea(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }
}
