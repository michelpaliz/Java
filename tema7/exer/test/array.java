import java.util.Arrays;

public class array {


    public static int[] content(int number[]){
        for (int i = 0; i < number.length ; i++){
            number[i] = i;
        }
        return number;
    }

    public static void main (String[]args){
        int a [];
        a =  new int [20];
    
        System.out.println(content(a));
        // System.out.println(Arrays.toString(a));
        System.out.println(a.getClass().getSimpleName());

    
        String[] array = new String[] {"John", "Mary", "Bob"};
        System.out.println(Arrays.toString(array));

        int[] intArray = { 7, 9, 5, 1, 3 };
        System.out.println(Arrays.toString(intArray));
    }
    
}
