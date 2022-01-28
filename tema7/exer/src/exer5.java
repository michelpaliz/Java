import java.util.Scanner;

public class exer5 {
    
    public static Scanner myInput = new Scanner(System.in); 

    //  public static String[] countWordsUsingSplit(String input) { 
    //     if (input == null || input.isEmpty()) { 
    //         return null; 
    //     } 
    //     String[] s = input.split("\\s+");
       
    //     // String s = new String(input);
    //     // s.split("\\s+"); 
        
    //     return s;

    //     // words[0] = "Hello";
    //     // words[1] = "World";
       
    // }

    public static int countWordsUsingSplit(String input) { 
        if (input == null || input.isEmpty()) { 
            return 0; 
        } 
        String[] s = input.split("\\s+");
       
        // String s = new String(input);
        // s.split("\\s+"); 
        // words[0] = "Hello";
        // words[1] = "World";
        word(s);
        who(s);
        character(s);
        // countChar(s);
        return s.length;

       
    }


    public static void word(String[] a  ){
        System.out.println("La frase que introduciste tiene estas palabras");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    
    // public static void countChar(String[] a){
        
    //     int countNumber = 0;
    //     for (int i = 0; i < a[0].length(); i++){
    //         countNumber = i;
    //     }
    //     // System.out.println("Esta frase contiene "+ countNumber + " palabras");
    //     for (int i = 0; i < a[1].length(); i++){
    //         countNumber = i;
    //     }

    // }



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
