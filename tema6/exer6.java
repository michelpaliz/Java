

public class exer6{

    public static char myPrint (char a,  int b, int c){

        for ( int i = 0 ; i < b ; i++ ){

            for (int j = 0 ; j < c ; j++){
                System.out.print(a);

            }

            System.out.println();
 
         }

         return a; 



    }



    public static void main (String[]args){
    
        myPrint('*', 2, 3);



    }




}