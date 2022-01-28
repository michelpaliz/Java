import libs.randArray;
import java.util.Arrays;
import libs.multiplo;
import java.util.Scanner;
import java.util.Random;


public class exer21 {

    public static Scanner myInput = new Scanner(System.in);

        public static int mostrarMenu(){

            System.out.println("***************************");
            // System.out.println("1. Rellenar array");
            System.out.println("1. Visualizar contenido del array");
            System.out.println("2. Visualizar contenido par");
            System.out.println("3. Visualizar el contido multiplo de 3");
            System.out.println("0. Salir del menu");
            return Integer.parseInt(myInput.nextLine());
    
        }

        public static void user (int user, int  a[] ){
            if (user == 1){
                System.out.println(Arrays.toString(a));
                // for (double d:a)System.out.printf("%.2F", d);
                // System.out.println();
            }else if(user == 2){
                System.out.println(Arrays.toString(multiplo.multiploNewArray(a, 2)));
            }else if (user== 3){
                System.out.println(Arrays.toString(multiplo.multiploNewArray(a,3)));
            }else if( user == 0){
                return;
            }
    
            
        }

        

        public static void main (String[]args){

            final int MIN  = 1;
            final int MAX = 49;

            // double a[] = new double[10];  
            int b[] = new int [50];
            
            Random r =  new Random();

            // int b[] = {r.nextInt(10-0+1)+1 };

            System.out.println(Arrays.toString(b));

            // System.out.println(Arrays.toString(randArray.randomGenerator(b, MIN, MAX)));

            // System.out.println(Arrays.toString(randArray.randomGeneratorMath(b, MIN, MAX)));



            // using the menu 
            user(mostrarMenu(),randArray.randomGenerator(b, MIN,MAX));
            // user(mostrarMenu(),randArray.randomGeneratorMath(b, MIN,MAX));
            // System.out.println(multiplo.multiplo(randArray.randomGeneratorMath(b, MIN, MAX), 2));


            // for(int i = 0; i < randArray.ranrandomGenerator(a, min, max); i++){

            // }


            

            // System.out.printf("'%.2f'%n", 4.1473);

            // this code works
            //  for (double d:randArray.randomGenerator(a, MIN,MAX))System.out.printf("%6.2f", d);
            // System.out.println();

           
            // System.out.println(multiplo.multiplo(a,2));
            // System.out.println(multiplo.multiplo(a,3));



            // this code below doens't work
            // System.out.printf("'%.2f'%n",randArray.randomGenerator(a, MIN,MAX) );


        }




}
