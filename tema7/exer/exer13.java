
public class exer13 {

    public static void printArray(int array[]) {
        System.out.printf("[");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d", array[i]);
        }
        System.out.printf("] \n");
    }

    public static void main(String[] args) {

        int a[];
        a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        printArray(a);

    }

}
