import java.util.Scanner;
public class splitArray {
    public static void main(String args[]) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the required size of the array ::");
        int size = s.nextInt();
        int [] myArray = new int[size];
        System.out.println("Enter elements of the array");
        for(int i=0; i< size; i++) {
            myArray[i] = s.nextInt();
        }


        System.out.println(Arrays.toString(myArray));
        int[] myArray1 = Arrays.copyOfRange(myArray, 0, myArray.length/2);
        int[] myArray2 = Arrays.copyOfRange(myArray, myArray.length/2, myArray.length);
        
        System.out.println("First half of the array:: "+Arrays.toString(myArray1));
        System.out.println("First second of the array:: "+Arrays.toString(myArray2));
    }
    
    
}
