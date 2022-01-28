import libs.multiplo;
import libs.randArray;
import java.util.Arrays;

public class exer19 {

    public static void main(String[] args) {

        double[] a = new double[100];
        int[] b = new int[100];
        int[] c = new int[200];

        System.out.println(randArray.randomGeneratorMath(0, 10));

        // This random is not working properly
        // System.out.println(Arrays.toString(randArray.randomGenerator(a, 0, 100)));

        // b = randArray.randomGeneratorMath(b, 0, 100);
        System.out.println(Arrays.toString(randArray.randomGeneratorMath(b, 0, 100)));
        System.out.println(Arrays.toString(multiplo.multiploNewArray(randArray.randomGeneratorMath(b, 0, 100), 5)));
        // With more range than before
        c = randArray.randomGeneratorMath(c, 0, 100);
        System.out.println(Arrays.toString(multiplo.multiploNewArray(c, 5)));

        // System.out.println(Arrays.toString(c));

        // This multiplo method works fine
        System.out.println(multiplo.multiplo(a, 5));

        // This multiploNewArray works fine but it prints the values each one separetly
        // System.out.println(Arrays.toString(multiplo.multiploNewArray(b, 5)));

        // Get the class name for each array
        System.out.println(multiplo.multiplo(a, 5).getClass().getSimpleName());
        System.out.println(multiplo.multiploNewArray(b, 5).getClass().getSimpleName());

        // for (int i = 0; i< a.length;i++){
        // a[i] = randArray.random(0,10);

        // }

        // System.out.printf("%2f",Arrays.toString(a));
        // String.format("%d2", a);
        // String.format("%2f", a);

        // System.out.println(Arrays.toString(multiplo(a,5)));

    }

}
