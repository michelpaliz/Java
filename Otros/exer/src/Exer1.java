import java.util.Arrays;

public class Exer1 {

    public static final int N_GRUPOS = 6;
    public static final int N_FRUTAS = 7;
    public static int LONGITUD;
    public static String rojo[] = { "fresa", "tomate", "cereza", "pimiento rojo", "frambuesa", "sandia", "manzana" };
    public static String amarillo[] = { "mango", "pimiento amarillo", "limon", "banana", "piña" };
    public static String verde[] = { "kiwi", "brocoli", "aguacate", "pepino", "espinaca", "lechuga", "melon" };
    public static String cafe[] = { "almendra", "tamarindo", "papas" };
    public static String morado[] = { "cebolla", "camote", "uva", "berenjenas", "remolacha", "arandanos" };
    public static String naranja[] = { "zanahoria", "papaya" };

    public static void fillNullValues(String[] name, String group) {
        String result = "";
        System.out.printf("\nGrupo " + group + " :");

        for (int i = 0; i < name.length; i++) {
            String format = " %-5S";
            System.out.printf((String.format(format, name[i] + ", ")));
        }

        LONGITUD = name.length;
        System.out.println(result + "\n" + " tiene una longitud de " + LONGITUD + " palabras");

        if (LONGITUD >= N_FRUTAS) {
            System.out.println("\n**** El grupo " + group + "  contiene el mayor numero de frutas ");
        }
    }

    public static void execute() {

        int i;
        int j;

        // System.out.println(Arrays.toString(rojo));

        fillNullValues(amarillo, "amarillo");
        fillNullValues(rojo, "rojo");
        fillNullValues(verde, "verde");
        fillNullValues(cafe, "cafe");
        fillNullValues(morado, "morado");
        fillNullValues(naranja, "naranja");

        // int a[] = new int[N_FRUTAS];
        // for (j = 0; j < a.length; j++) {
        // a[j] = LONGITUD;
        // }
        // System.out.println(Arrays.toString(a));

    }

}