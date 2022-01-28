package libs;
import java.util.Arrays;

public class mediaArray {

    public static String mediaArray(double a[]){

        double sumaTodo = 0;
        for(int i = 0; i<a.length ; i++){
            sumaTodo = a[i] + sumaTodo;
        }
        double mediaTotal = sumaTodo / a.length;
        return ("la media de todo el array es " + mediaTotal);

    }
    
}
