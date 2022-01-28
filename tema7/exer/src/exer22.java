import libs.array;
import libs.randArray;
import java.util.Arrays;

public class exer22 {

    public static int[] inverse(int a[]) {

        for (int i = 0; i < a.length; i++) {
            a[i] = a.length - i;

        }

        return a;

    }

    public static int[] greaterThan(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 10) {
                a[i] = -1;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = new int[20];

        // we generate only the number of elements of the array;
        System.out.println(Arrays.toString(a));

        // We generate the values of the array from 0 to 10
        System.out.println(Arrays.toString(array.content((a))));

        // we inverse the array
        System.out.println(Arrays.toString(inverse(a)));

        // put -1 the numbers that are less or equals of 10
        System.out.println(Arrays.toString(greaterThan(a)));

        // generate random numbers from 0 to ----
        System.out.println(Arrays.toString(greaterThan(randArray.randomGenerator(a, 0, 20))));

        // generate random numbers from 0 to ----
        System.out.println(Arrays.toString(greaterThan(randArray.randomGeneratorMath(a, 0, 20))));

    }

}
