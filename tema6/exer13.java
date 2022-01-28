import java.util.Scanner;


public class exer13{



    public static void traductor(String name, String x ){

        boolean correct = false;

     
        while(!correct){

            if (x. equals("a")|| x.equals("A")){
                System.out.println("Bon dia " + name);
                correct = true;
            }else if (x.equals("b")){
                System.out.println("Buenos dias" + name);
                correct = true;
            }else if (x.equals("c")){
                System.out.println("Good morning " + name);
                correct = true;

            }
            else{
                System.out.println("Introduce a,b o c ");
                break;

            }
        }


    }

    public static void main (String[]args){

        Scanner myInput = new Scanner(System.in);

        System.out.println("Hola dime tu nombre");

        String userName = myInput.nextLine();
        String name = userName;

        System.out.println(" Escoge uno a =  valenciano , b = castellano , c = ingles ");
        String x = myInput.nextLine();
        

        traductor(name,x);
        myInput.close();


    }





}