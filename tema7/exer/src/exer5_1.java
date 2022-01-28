import java.util.Scanner;

public class exer5_1 {


    public static Scanner myInput = new Scanner(System.in); 

    public static int countWordsUsingSplit(String input) { 
        if (input == null || input.isEmpty()) { 
            return 0; 
        } 
        String[] s = input.split("\\s+");
        word(s);
        who(s);
        character(s);

    
        return s.length;

       
    }


    public static void word(String[] a  ){
        System.out.println("La frase que introduciste tiene estas palabras");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    
    public static void who(String[] a){

        if (a[0].length() <= a[1].length()){
            System.out.println("A es mayor");
        }else if (a[0].length() > a[1].length()) {
            System.out.println("B es menor");
        }else{
            System.out.println("Son iguales");
        }

    }


    public static void character(String[] a){

        for(int i = 0; i < a[0].length(); i++  ){
            System.out.println( "Characters "  + a[0].charAt(i));
        }

    }




    public static void main(String[]args){

        System.out.println("Inserta un frase");
        String user = myInput.nextLine();
        System.out.println("Esta frase tiene " + countWordsUsingSplit(user) + " palabras");





    }





    
}
