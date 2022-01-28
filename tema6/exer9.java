import java.util.Scanner;


public class exer9{


        public static long sumatorio (int num){
            
            int a = 0;
            
            for (int i = 0; i <= num; i++){
                
                System.out.print(i);
                a = i + a;
             

                
            }

            System.out.println();

            System.out.println(a);

            return a;



        }


        public static void main (String []args){


            sumatorio(5);

            //Variable
            int userNumber;

            Scanner myInput = new Scanner(System.in);

            System.out.println("Introduce un numero");
            userNumber = myInput.nextInt();

            sumatorio(userNumber);




        }




}