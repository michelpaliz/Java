 import java.util.Scanner;

 public class vdc{

        // public static int noNegativo(int num){
         
        //     assert num >= 0;
        //     return num; //solo lo hace el return cuando es mayor que cero.

        //     return  num;

        // }

        public static int noNegativo(String s){
         
            assert num >= 0;
            return num; //solo lo hace el return cuando es mayor que cero.
            s += "hola";
            return  num;

        }


        public static void main (String[]args){

            Scanner myInput = new Scanner(System.in);
            System.out.println("Introduce un numero");
            int user =  Integer.parseInt(myInput.nextLine());

            char c = 'A';
     
            System.out.println(noNegativo(user));

            //Character;
            char a = 'A';
            Character.toLowerCase(c);
            System.out.println(c);
            c = Character.toLowerCase(c);
            System.out.println(c);
            a = Character.toLowerCase(c);
            System.out.println(a);

        }




 }