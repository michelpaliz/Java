import java.util.Random;

public class Exer2 {

    public static final int MAX = 29;
    public static final int MIN = 9;
    public static Random r = new Random();

    static int randomGeneratorMath(int min, int max) {
        int a;
        return a = (int) (Math.random() * (max - min + 1)) + min;

    }

    public static void execute() {

        System.out.println(randomGeneratorMath(MAX, MIN));

        int random = randomGeneratorMath(MAX, MIN);
        // int ca = 0;, int be =1; int llo = 2;
        String ca = "ca";
        String be = "be";
        String llo = "llo";

         int division = random % 3;
        System.out.println(division);
        // int resultado = division * 3;
        // System.out.println(resultado);

        for(int i = 0; i<resultado; i++ ){
                  System.out.printf(ca + be + llo);
        for(int j = resultado; j < random; j++){
        if ((( random - resultado) = 1)){
        System.out.print(ca);
        }else if( (random - resultado) = 2){
        System.out.println(ca + be);
        }else if ((random - resultado)= 3){
        System.out.println(ca+be+llo);
        }
        }

        }

    }

}
