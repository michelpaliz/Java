public class exer13 {

    /**
     * @param array this method will calculate the media of our array
     */

    public static void printArray(int printArray[]){
        System.out.printf("[");
        for(int i = 0; i < printArray.length; i++){
            System.out.printf("%d",printArray[i]);
        }
        System.out.printf("] \n");
    }
    /**
     * @param array this method will calculate the media of our array
     */

    public static void media(int array[]){
        int suma = 0;
        for(int i = 0; i< array.length; i++){
            suma = array[i] + suma;
        }
        double media = suma/array.length;
        System.out.println(media);
    }
    
    public static void main  (String[]args){

        int a [];
        a =  new int [10]; 

        for (int i = 0; i < a.length ; i++){
            a[i] = i;
        }

        printArray(a);
        media(a);

    }





}
