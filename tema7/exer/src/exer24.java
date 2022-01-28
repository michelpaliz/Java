import java.util.Arrays;
import libs.array;

public class exer24 {

    // Write a program where the first array contains 50 elements and the second
    // array generate 50 elements in this way.
    // p(0) = v(0)
    // p(1)= v(0) + v(1)

    public static int[] arrayFactorial(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                a[i] += b[j];
            }
        }
        return a;
    }

    public static void main(String[] args) {

        int[] a = new int[50];
        int[] b = new int[50];
        int[] c = new int[a.length];
        c = arrayFactorial(a, b);

        System.out.println((Arrays.toString(array.content(a))));
        System.out.println((Arrays.toString(array.content(b))));
        System.out.println(Arrays.toString(arrayFactorial(a, b)));

        int v[] = { 0, 1, 2, 3, 4, 5 };
        int p[] = { 0, 1, 2, 3, 4, 5 };
        int resutl[] = new int[v.length];
        resutl = arrayFactorial(v, p);

        System.out.println(Arrays.toString(resutl));

    }

}
