import java.util.Random;

public class exer11{


    // public static int random (int max, int min, int num){

    //     Random r =  new Random();
    //     int random = r.nextInt((max-min+1)+min);

    //     for (int j = 1 ; j <= num; j++){
    //         random = r.nextInt((max-min+1)+min);
    //         System.out.println(random);

            
    //     }
    

    //     return random;
        

    // }



    //  public static void traductor ( int max, int min, int num){

    //         Random r  = new Random();
          
    //         int random = r.nextInt((max-min)+1);



    //     String a; 

    //         for (int j = 0 ; j < num ; j++){

    //             random = r.nextInt((max - min ) +1);

    //             for (int i = 1; i <= num; i++){
    //                 a = Integer.toString(i);
    //                     a = ("Partido " + i );
    //                     // System.out.println(a);

    //                     if (random == 1){
    //                         String win = Integer.toString(random); // Integer.toBinaryString ??? what is it and why does the output is with 2 decimals?
    //                         // win = "1";
    //                         System.out.println( a + " " + win);
    //                     }else if (random == 2){
    //                         String lose = Integer.toString(random);
    //                         // lose = "2";
    //                         System.out.println(a + " " + lose);
    //                     }else{
    //                         String draw = Integer.toString(random);
    //                         draw = "x";
    //                         System.out.println(a + " " + draw);
    //                     }
                    
                        
    //             }
    //         }
    // }


    public static int partidos (int max , int min, int num){
           
        Random r = new Random();
        String a;
        int random = r.nextInt((max-min)+1);

        for (int i = 1; i <= num;i++){

            a = Integer.toString(i);
            a = ("Partido " + i + " ");
                
            random = r.nextInt((max-min)+1);

            if ( random == 2 ){
                System.out.println( a + random  );

            }else  if ( random == 1  ){
                System.out.println( a + random  );
            }else if ( random == 0  ){
                System.out.println( a + "*" );
            }

        }

        return random;
    }



    public static void main (String[]args){

        
        int min = 0;
        int max = 2;
        int num = 15;
      
        // traductor(random(max,min,num),num);

        partidos(max, min, num);

    

    }





}