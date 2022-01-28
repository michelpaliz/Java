import java.util.Random;

public class random{

    public static void main (String[]args){


            Random r =  new Random();
                    boolean correct = false;

                    int random;

                    while(!correct){

                        for (int j = 1 ; j <= num; j++){
                            random = r.nextInt((max-min+1)+min);
                            System.out.println(random);
                            correct = true;
                        
                        }
                    }



    }






}