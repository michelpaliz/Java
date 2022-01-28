import java.util.Scanner;


public class exer7 {
    
    // public static void split(String str, String searchString,int numberOfArrays ){
    //     // The string split() method breaks a given string around matches of the given regular expression
    //     String[] arrStr = (str.split(searchString,numberOfArrays));

    //     for (String a : arrStr)
    //         System.out.println(a);
    // }    


    public static void split(String str, String searchString ){
        // The string split() method breaks a given string around matches of the given regular expression
        String[] arrStr = (str.split(searchString));

        for (String a : arrStr)
            System.out.println(a);
    }    


    public static int contador(String str){
        int spaceCount = 0;
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        return spaceCount;
    }



    public static void main (String[]args){

        Scanner myInput = new Scanner(System.in);
        System.out.println("Inserta una frase");
        String str = myInput.nextLine();
        myInput.close();


        // split(str, " ", 3);

        System.out.println(contador(str));

        // split(str," ",contador(str));

        split(str, " ");

        // System.out.println(split(str," ",contador(str)));


    }





}
