


public class exer16b {

        public static void printC (int num, char x ) {



            // for (int i = 0; i <= 9; i++){
            
            //     for (int j = 0; j <=9; j++){

            //         for  ( int k = 0 ; k <=9; k++){
            //             for (int l = 0; l <= 9; l++){
            //                 String s = i + "-" + j + "-" + k + "-" + l;

            //                 System.out.println(s = s.replace(String.valueOf(num),String.valueOf(x)));//convierteme el valor num into x
            //                 // System.out.println(i + "-" + j + "-" + k + "-" + l);
            //             }
                     
            //         }
                 
            
            //     }
            // }

            String numStr = String.valueOf(num);
            String charStr = String.valueOf(x);


            for (int i = 0; i <= 9; i++){
            
                for (int j = 0; j <=9; j++){

                    for  ( int k = 0 ; k <=9; k++){
                        for (int l = 0; l <= 9; l++){
                            String s = i + "-" + j + "-" + k + "-" + l;
                            if (num == i || num == j || num == l){

                               s = s.replace(numStr,charStr);
                                System.out.println(s);


                            }
        
                        }
                     
                    }
                 
            
                }
            }



        }



        public static void main (String []args){
            String s = "Saludos juan";
            // s.replace("a","e");
            s = s.replace("a","e");
            System.out.println(s);


            printC(4,'c');

        }


    
}


