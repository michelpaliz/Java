import java.util.Random;
public class exer15 {

    // public static Formatter fmt = new Formatter();
  

    // public static void formatter(int array[]){
    //     // a = (a).toCharArray();
    //     System.out.printf("[");
    //     for(int n : array){
    //         // System.out.print(fmt.format("%15s %15s", array.length/5, array.length/5));
    //         System.out.printf("%d, ",n);
         
    //     }
    //     System.out.printf("]");
    
       
    // }
    //     // return value

    // public static void printRangeOfInts(int x, int y) {
    //     int[] a = { 0, 1, 2, 3, 4, 5, 6 };
    //     for (int i = a.length - x; i >= a.length - y; i--) {
    //             System.out.println("Value:" + a[i]);
    //     }
    // }

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
                result.append("\n");
                cont = 0;
            }
           

            // if(i %nColumnas == 0){ //quiero que i sea distinto de cero y que sea cero
            //     // result.append(a[i]);
            //     result.append("\n");
            // }
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
    
        // double a [] = {4,58,9,5,7};
        double b[] = new double[20];
        for (int i = 0; i< b.length;i++){
            b[i] = r.nextDouble();
        }
        System.out.println(tabulaArray(b,NUMERO_COLUMNAS,ANCHOCOLUMNA));
        // System.out.println(tabulaArray(b,4,10));
      

        // Formatter fmt = new Formatter();
        // fmt.format("%15s %15s", "First Column", "Second Column");
        // four(intArray.content(a));

        //Print the array
        // formatter(intArray.content(a));

        // four(intArray.content(a), 4);

        // printRangeOfInts(1, 0);


        // formatter(a);

       //System.out.println(intArray.printArray(intArray.content(a)));

       //System.out.println((Arrays.toString(intArray.printArray(intArray.content(a)))));
      //System.out.println((Arrays.toString(intArray.content(a))));
      
    //    System.out.println(a.getClass().getSimpleName());
        // formatter((Arrays.toString(intArray.printArray(intArray.content(a)))));



        // formatter(intArray.printArray(intArray.content(a)));






    }

    
}
