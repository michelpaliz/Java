import java.util.Scanner;

public class exer14 {


    public static int factorial (int num){

        int a = 1;


        for (int i = 1; num > i ;  num--){

            a *= num ;
 
        }

        return a;

    }


    public static void formula (double n, double m , double o){

        // System.out.println(n * 2);

        // System.out.println(m * 2);
    

        double f = 0;
        // double r = 0;

        f = n/(m*o);

    


        // r = f / 0.10;

        System.out.println("Este es el resultado " + f);

      




    }



    public static void main (String[]args){

        Scanner myInput = new Scanner(System.in);

        System.out.println("Escribe el valor de n!");
        int n = myInput.nextInt();
        System.out.println("Escribe el valor de m!");
        int m = myInput.nextInt();


        int o = n - m;

        // System.out.println(factorial(n));
        // System.out.println(factorial(m));

     
        formula(factorial(n),factorial(m),factorial(o));
        myInput.close();
 
    }









    
}
