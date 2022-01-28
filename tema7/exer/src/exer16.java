import java.util.Random;
import java.util.Arrays;
import libs.randArray;


public class exer16 {

    public static String doubleArray(double a[]){

        
        double sumaTodo = 0;
        double suma = 0;
        double length = 0;
        for(int i = 0; i<a.length ; i++){
            // a[i] = i;
            sumaTodo = a[i] + sumaTodo;

            if(a[i] >= 5){
                suma = a[i] + suma;
                length += 1;
            }
        }

        double media = suma / length;
        double mediaTotal = sumaTodo / a.length;
        return (Arrays.toString(a) + "\n" + "la media de todo el array es " + mediaTotal + '\n'+ "La media de los numeros mayores o iguales de cinco es " + media );
        // return (Arrays.toString(a) + "\n" + "la media de todo el array es " + mediaTotal);
    }



   public static void main (String[]args){
        //Random
        Random r = new Random();
        //Variable
        final double max = 10;
        final double min = 0;
        double b[] = new double[30]; //here we create a new direction in our memory

        for (int i = 0; i< b.length;i++){
            b[i] = randArray.random(min, max);
            // b[i] = r.nextDouble() * (max-min+1)+min;
            // b[i] = r.nextDouble();
        }

        System.out.println(b);//this only prints a direction not values;
        //print my double array
        System.out.println(doubleArray(b));
    }


}
