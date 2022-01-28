
import java.util.Scanner;


public class exer6 {

    public static Scanner myInput = new Scanner(System.in);
    
    public static void fact(int num, String str){

        for(int i = 0; i <= str.length() ; i++){

            System.out.println(str + " -");

        }

        for(int i = 0; i <= num ; i++){

            System.out.println(str);

        }
    
    }


    public static void main (String[]args){

        System.out.print("Inserta una frase: ");
        String user = myInput.nextLine();
        System.out.print("Cuantas veces quieres que se repita la frase: ");
        int userInt = Integer.parseInt(myInput.nextLine());
        fact(userInt, user);




    }

}
