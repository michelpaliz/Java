import java.util.Scanner;

public class exer10 {

    public static String reverseString(String str){  
        StringBuilder sb=new StringBuilder(str);  
        sb.reverse();  
        return sb.toString();  
    }  

    public static String replaceAll(String str){
        return str.replaceAll(" ","");
    }

    public static boolean replaceAll(String str, String reverseStr){
        if (replaceAll(str).startsWith(reverseStr)){
            return true;
        }else {
            return false;
        }
    }

    public static String check(Boolean fromReplace){
        if(fromReplace == true){
            return ("La frase que introducistes es palindroma");
        }else{
            return ("La frase que introducistes no es palidroma");
        }
    }


    public static void main(String[]args){
        Scanner myInput = new Scanner(System.in);
        System.out.println("Inserta una palabra");
        String str = myInput.nextLine();
        myInput.close();
        System.out.println(check(replaceAll(str,(reverseString(replaceAll(str))))));
        // System.out.println(check(str, reverseString(str)));
        // System.out.println(check(str, (str)))

        // System.out.println(replaceAll(str));

        // String a = "amad a la dama";
        // String b = "amad a la dama";

        // System.out.println(reverseString(replaceAll(b)));

        // if (replaceAll(a).equalsIgnoreCase((reverseString(replaceAll(b))))){
        //    System.out.println(true);
        // }else {
        //     System.out.println(false);
        // }

        System.out.println(reverseString(str));


    }
    
}
