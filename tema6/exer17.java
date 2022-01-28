



public class exer17 {


    public static void ceros (int col, int row, char c){

        for (int i = 0; i <= col; i++){

            System.out.print(c);
            

            for (int j = 0; j < row ; j++){
                System.out.print(c);
            }

            System.out.println();
         
        }






     
              
    }
        
    




    public static void main (String[]args){


            ceros(2,9,'$');


    }

    
}


