

public class exer16 {

    
    public static void ceros (int col){

        for (int i = 0; i < col; i++){

            System.out.println(0 + " ");
       
        }

        System.out.println(" ");
       


     
              
    }
        
    


    public static void loop (int nc){

        for (int i = 0; i <= 10; i++){

                if (i <= 9){
                    nc++;
        
                    System.out.println( nc - 1);

                  
                }
                // if ( nc > 9){
                //     for (int j = 0 ; j < 10; j++){
                //         System.out.print(j);
                //     }
                // }


        }



        
        
    }
    

    
    public static void main (String[]args){
        
        char a  = 'c';
        int max = 10;
        int col = 4;
        
        // ceros (a,col, max);

      
        ceros(9);loop(0);

        ceros(9);
        loop(0);



        
    }


}
