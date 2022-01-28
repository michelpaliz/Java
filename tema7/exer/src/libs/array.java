package libs;
// import java.util.Arrays;

public class array {

    public static int[] content(int number[]){
        for (int i = 0; i < number.length ; i++){
            number[i] = i;
        }
        return number;      
    }

    public static double[] content(double number[]){
        for (int i = 0; i < number.length ; i++){
            number[i] = i;
        }
        return number;
    }

    public static int[]  inverse  (int a[]){

        for(int i = 0; i < a.length; i++){
            a[i] = a.length - i ;
 
        }

        return a;

    }
    
    // public static int[] printArray(int array[]){
    //     //System.out.printf("[");
    //     // int value = 0;
    //     // for(int i = 0; i < array.length; i++){
    //     //     //System.out.printf("%d ",array[i]);
    //     //     // return array[i];
    //     //     // return printf("[ %d ] \n",array[i]);
    //     //     // printf("[ %d ] \n",array[i]);
    //     //     // return String.format("%d %d", b, a);
    //     //     // String value =  String.format(" [ %d ]", array[i]);
    //     //     // value.toCharArray();
    //     //     // int number = Integer.parseInt(String.valueOf(value));
    //     //     // value = array[i];
    //     //     // Integer.parseInt(value.toCharArray());
    //     // }

    //     // return (Arrays.toString(array));
    //         return array;
        
    //     // return array;
    //     //System.out.printf("] \n");
    // }

   
    


}
