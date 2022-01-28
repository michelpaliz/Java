import libs.array;
import java.util.Scanner;
import java.util.Arrays;
import libs.add;
import libs.div;

public class exer18 {

    public static double[] sumaArray(double[] first, double[] second){
        if(first != null && second != null && first.length != second.length){
            return null;
        }
        double[]  suma = new double [first.length];

        for(int i = 0; i < first.length; i++ ){
        
            suma[i] = first[i] + second[i];

        }
        return suma;
    }


    public static void main(String[]args){

    System.out.println("Enter the required size of the array :: ");
        Scanner myInput= new Scanner(System.in);
        int size = myInput.nextInt();
        double myArray[] = new double [size];

        // System.out.println(array.content(myArray));

        

        add.sumaTotal(array.content(myArray),(array.content(myArray))); //suma total general

        System.out.println(Arrays.toString(sumaArray(array.content(myArray), array.content(myArray)))); //suma por cada elemento 1#

        System.out.println(Arrays.toString(add.add(array.content(myArray), array.content(myArray)))); //suma por cada elemento del array 2#

        System.out.println(Arrays.toString(div.div(array.content(myArray), array.content(myArray)))); //divison por elemento

    //  System.out.println("Elements of the array are: "+Arrays.toString(myArray));
    //   System.out.println("Sum of the elements of the array ::"+sum);

    }
    
}
