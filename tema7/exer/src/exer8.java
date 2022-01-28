import java.util.Scanner;
public class exer8 {


    public static int coutnSpaces(String str){
        int spaceCount = 0;
            for (char c : str.toCharArray()) {
                if (c == ' ') {
                    spaceCount++;
                }
            }

        return spaceCount +1;
    }

    
    public static void split(String str, String searchString,int numberOfArrays ){
        // The string split() method breaks a given string around matches of the given regular expression
        String[] arrStr = (str.split(searchString,numberOfArrays));

        for (String a : arrStr)
             System.out.println(a + " " + a.length());
    }    


    public static void main (String[]args){

            Scanner myInput = new Scanner(System.in);
            System.out.println("Inserta una frase");
            String str = myInput.nextLine();
            myInput.close();

            split(str, " ", coutnSpaces(str));


            //  System.out.println(str.replaceAll(" ", "").length());
            //  System.out.println(str.replaceAll("\\s+", "").length());

            //  int spaces = str.replaceAll("[^ ]", "").length();
            //  System.out.println(spaces);
    
    

    
    
    }




}
