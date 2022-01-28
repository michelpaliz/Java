
public class prueba {



    public static void main (String[]args){

        String[] errorSoon = {"Hello" ,"World"};
        // String[] errorSoon = new String[2];
        // errorSoon[0] = "Hello";
        // errorSoon[1] = "World";
        if (errorSoon[0].length() < errorSoon[1].length()){
            System.out.println("A es mayor");
        }else{
            System.out.println("B es menor");
        }
    

        int countNumber = 0;
        for (int i = 0; i < errorSoon[0].length(); i++){
            countNumber = i;
        }
        System.out.println("Contiene "+ countNumber + " caracteres");

        System.out.println(errorSoon.length);


        for (int j = 0; j < errorSoon.length; j++) {
            System.out.println(errorSoon[j]);
          }







        
    }


}
