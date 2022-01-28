package twoDimensionalArray;

public class media {

    public static void media( arr[][]){
        int suma = 0;
        int promedio = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                suma += arr[i][j];
                promedio = suma / arr.length;
            }
        }

        System.out.print("\nEl promedio de la matriz es : " + promedio + "\n\n");
    }

    
}
