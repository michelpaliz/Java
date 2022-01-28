import libs.array;
import libs.randArray;
import libs.inverse;
import java.util.Arrays;

public class exer23 {

    public static void main(String[] args) {

        int[] a = new int[10];

        // This will only generate only 0 numbers
        System.out.println(Arrays.toString(a));

        // We generate the values of the array from 0 to 10
        System.out.println(Arrays.toString(array.content((a))));

        // We generate random numbers from 0 - 20 but in a range of 10 values of maximum
        System.out.println(Arrays.toString(randArray.randomGeneratorMath(a, 0, 20)));

        // We print now the array in reverse mode
        System.out.println(Arrays.toString(inverse.inverseInt(randArray.randomGeneratorMath(a, 0, 20))));

    }

}
