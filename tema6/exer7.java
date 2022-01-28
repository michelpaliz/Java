

public class exer7{



    public static int factorial (int num){

        int a = 1;


        for (int i = 1; i <= num ; i++){

            a = a * i;

        }


        return a;

    }



    public static void main (String[]args){


        // System.out.println(factorial(3));
        
        // factorial(3);

        System.out.println(factorial(30));


    }





}