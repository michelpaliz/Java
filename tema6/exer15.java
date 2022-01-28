import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

import javax.lang.model.util.SimpleAnnotationValueVisitor9;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;


public class exer15 {

    // public static void menu(String x){

    //     if (x.equals("1")){
    //         System.out.println("Palabra mas larga");
    //     }else if (x.equals("2")){
    //         System.out.println("Palabra mas corta");
    //     }else if (x.equals("3")){
    //         System.out.println("Numero de vocales");
    //     }else if(x.equals("0")){
    //         System.out.println("Salir");
    //     }else{
    //         System.out.println("Inserta un numero de 1 a 3");
    //     }
        

    // }

    public static void lng ( String a, String b , String c){

        
        if (a.length() > b.length() && a.length() > c.length()){
            System.out.println("La primera palabra es la mas grande");

        }else if(b.length() > a.length() && b.length() > c.length()){
            System.out.print("La segunda palabra es la mas grande");
        }else{
            System.out.println("La tercera palabra es la mas grande");
        }
    
    }

    public static void sht (String a, String b, String c){
        if (a.length() < b.length() && a.length() < c.length()){
            System.out.println("La primera palabra es la mas short");

        }else if(b.length() < a.length() && b.length() < c.length()){
            System.out.print("La segunda palabra es la mas short");
        }else{
            System.out.println("La tercera palabra es la mas short");
        }
    }

    public static void character(String a, String b, String c){
        
        vowels(a);
        vowels(b);
        vowels(c);
        


    }



    public static void vowels (String x){

        // int num = 0;
        // char[] charA = a.toCharArray();
        
        int l = x.length();
        int count = 0;
        int countO = 0;

        for (int i = 0; i < l ;i++){
            char ch = x.charAt(i);
            switch(ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'U':
                    count++;
                default :
                 

                
            }
         
        }
        System.out.println("Tiene un numero " + count + " de vocales");
    }





    public static void main (String []args){


        Scanner myInput = new Scanner(System.in);
        System.out.println("Inserta una palabra");
        String str1 = myInput.nextLine();
        System.out.println("Inserta la segunda palabra");
        String str2 = myInput.nextLine();
        System.out.println("Inserta una tercera palabra");
        String str3 = myInput.nextLine();


        lng(str1,str2,str3);
        sht(str1, str2,str3);
        character(str1,str2,str3);
        



    



    }
    
}
