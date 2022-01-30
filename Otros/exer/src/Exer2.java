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

        // ~JUEGO
        int random = randomGeneratorMath(MAX, MIN);
        // int ca = 0; int be =1; int llo = 2;

        String ca = "ca";
        String be = "be";
        String llo = "llo";

        int contador = 0;
        System.out.print("*************************************************");
        System.out.println(
                "\nSE ESCOGERA UN NUMERO ALEATORIO DEL 10 AL 30 Y SE CORTARA LA FRASE EN LA ULTIMA INTERACCION DEL NUMERO DE VECES ESCOGIDO ALEATORIAMENTE, SI LA ULTIMA SILABA ES BE ENTONCES GANAS Y SI LA ULTIMA ES CA O LLO ENTONCES PIERDES");
        System.out.println("*************************************************");
        System.out.println("Esto es el numero aleatorio " + random);
        System.out.println("Se  mostrara por pantalla repetido el numero de veces por silaba\n");

        while (contador < (random)) {

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

        // *Calcular el resto de la division
        int contRandom = random - 1; // *Le restamos 1 porque el cero cuenta como un valor mas asi que seria el
        // * (numero random - 1) para que nos cuadre la operacion

        int resto = (contRandom) % 3;
        String frase = "Mi nenita no se pinta el cabello";
        String frase2 = "Mi nenita se pinta pero no lo va hacer de todas maneras";

        if (resto == 0) {
            System.out.println(" \n\nLa ultima silaba es  " + ca + "\n" + frase);
        } else if (resto == 1) {
            System.out.println(" \n\nLa ultima silaba es  " + be + "\n" + frase2);
        } else if (resto == 2) {
            System.out.println(" \n\nLa ultima silaba es  " + llo + "\n" + frase);
        }

    }

}
