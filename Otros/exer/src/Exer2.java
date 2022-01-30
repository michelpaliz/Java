import java.util.Random;

public class Exer2 {

    public static final int MAX = 29;
    public static final int MIN = 9;
    public static Random r = new Random();

    static int randomGeneratorMath(int min, int max) {
        int a;
        return a = (int) (Math.random() * (max - min + 1)) + min;

    }

    public static void main(String[] args) {

        System.out.println(randomGeneratorMath(MAX, MIN));

        int random = randomGeneratorMath(MAX, MIN);
        // int ca = 0; int be =1; int llo = 2;

        String ca = "ca";
        String be = "be";
        String llo = "llo";

        int contador = 0;

        System.out.println("Esto es random " + random);

        while (contador < random) {

            if (contador < random) {
                System.out.print(ca + " ");
                contador++;
                if (contador < random) {
                    System.out.print(be + " ");
                    contador++;
                    if (contador < random) {
                        System.out.println(llo + " \n");
                        contador++;

                    }

                }

            }
        }

    }

}
