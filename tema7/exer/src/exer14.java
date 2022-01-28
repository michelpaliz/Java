
public class exer14 {

    // public static void print(char array[]){
        // for (int i = 0; i < array.length; i++) {
        //     String even = "";
        //     String odd = "";
        //     for (int j = 0; j < array.length; j++) {
        //         if (j % 2 == 0) {
        //             // even += array.charAt(j);
        //             even += array[j];
        //         } else {
        //             // odd += myString.charAt(j);
        //             odd += array[j];
        //         }
        //     }
        
        //     System.out.println(even + " " + odd);
        // }
    // }

    // public static void printEven(char array[]){
    //     System.out.printf("[");
    //     for(int i = 0; i < array.length; i+=2){
    //             System.out.printf("%d",array[i] );
    //     }
    //     System.out.printf("]");
    // }
    
    // public static void spaces(char b){

    //     for(int i = 47; i < 57 ; i++){
    //          b = (char) (i +'0');
    //          System.out.print(b + '\n');
    //     }
    // }

    // public static int numbers(int number){

    //     for(int i = 0; i < number; i ++){
    //         number+=i;
    //     }

    //     return number;

    // }

    /**
     * @param array this method shows even positions and odd positions in each array.
     * @param numSpaces I created this method with the aim to concatenate spaces with characters in order to create an specificed range of numbers;
     */

    public static void print(char array[]){
        String even = "";
        String odd = "";
        for (int j = 0; j < array.length; j++) {
            if (j % 2 == 0) {
                // even += array.charAt(j);
                even += array[j];
            } else {
                // odd += myString.charAt(j);
                odd += array[j];
            }
        }
    
        System.out.println(even + " " + odd);
        
    }

    public static String spaces ( int numSpaces){
        
        StringBuilder b = new StringBuilder();
        for(int i = 0; i < numSpaces;i++){ 
            // b = i + b;
            b.append(i);

        }
     
        // b.reverse();
        return b.toString();
        
  
    }

  
    public static void main (String[]args){
        char a[];
        a = new char[10];

        //I used the tocharArray method in order to convert it to an array of type char.
        a = (spaces(a.length)+ "").toCharArray();
        //I wrote this to check the value, length and the type of variable.
        System.out.println(a);
        System.out.println(a.getClass().getSimpleName());
        System.out.println(a.length);
        //here i called my print method that shows even and odd positions;
        print(a);


        // for(int i = 0; i < a.length; i++){
        //     // b = (char) (i +'0');
        //     // char[] chars = ("" + i).toCharArray();
        //     a = (spaces(10)+ i).toCharArray();
        //     // char c = (char) i;
        // }

        // a = (spaces(10)+ numbers(10)).toCharArray();
    

    }


    
}
