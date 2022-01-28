import java.util.Scanner;
public class exer9 {
    
    /**
     * @param a Primer parametro necesitamos un string 
     * @return me devuelve la posicion del string con su index
     */

    public static void charAt(String a){
        //Returns the character at the specified index position.
        for(int i = 0; i < a.length(); i++){
            // System.out.print(a.charAt(i));
            if (a.charAt(i) % 2 != 0){
                System.out.print(a.charAt(i));

            }
        }

        System.out.println();
    }

    public static String fraseImpar(String str){
        StringBuilder strB = new StringBuilder();
        for(int i = 1; i< str.length(); i +=2){
            strB.append(str.charAt(i));
        }

        return strB.toString();
    }

    public static void main (String[]args){

        Scanner myInput = new Scanner(System.in);
        System.out.println("Inserta una frase");
        String str = myInput.nextLine();
        myInput.close();
        // System.out.println(str.replaceAll(" ", ""));
        charAt(str);
        System.out.println(fraseImpar(str));
  

    }


}
