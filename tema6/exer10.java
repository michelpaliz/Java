import java.util.Scanner;

public class exer10{



    public static void m (int num){

       int  a = 0;

        // for (int i = 0; i <= num; i++){

        //    System.out.println(a = (i * num)); 
         

        // }


        if (num > 0 ){
             for (int i = 0; i <= num; i++){
                System.out.println(a = (i * num)); 
             }
        }else{
            System.out.println("No puede ser un num negativo");
        }

        

       

    }


    public static void main (String[]args){


        // System.out.println(m(5));

        // m(5);

        Scanner myInput = new Scanner (System.in);
        System.out.println("Introduce un numero entero");
        int num = Integer.parseInt(myInput.nextLine());
        System.out.println("Este es tu numero " + num);




        m(num);

        myInput.close();




    }




}