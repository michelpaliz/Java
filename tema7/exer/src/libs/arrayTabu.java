package libs;
import java.util.Random;

public class arrayTabu {

    public static String tabulaArray(double a[], int nColumnas , int anchoColumna){
        StringBuilder result = new StringBuilder();
        String format = "%" + anchoColumna + ".2f";//%0 rellenamos con ceros y .2f precision con dos decimales
        if(a==null || nColumnas <= 0)
        return null;

        int cont = 0;
        for(int i = 0; i < a.length; i++){
            cont++;
            result.append(String.format(format,a[i])); 
            if(cont == nColumnas){//cont sig 
                result.append("\n");//salto de linea
                cont = 0;
            }
        
        }

        return result.toString();

    }

    public static void main (String[]args){
        Random r = new Random();
        if(args.length != 2){
            System.out.println("Uso: Ejemplo COlumnas Anchocolumnas\n");
            System.exit(-1);
        }
        final int NUMERO_COLUMNAS = Integer.valueOf(args[0]); //de que tipo es args? es un string, y no puedo asignar un string a un entero
        final int ANCHOCOLUMNA = Integer.valueOf(args[1]);
    
        double b[] = new double[20];
        for (int i = 0; i< b.length;i++){
            b[i] = r.nextDouble();//generamos random en nuestro array.
        }
        System.out.println(tabulaArray(b,NUMERO_COLUMNAS,ANCHOCOLUMNA));
   

    }
    
}
