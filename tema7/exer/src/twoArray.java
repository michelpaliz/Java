import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;

//MATRIZ
public class twoArray {

    public static final int NUM_ROW = 10;
    public static final int NUM_COL = 10;

    public static void main(String[] args) {
        // We have to create a two dimensional arrays

        int a[][] = new int[5][5];
        int cont = 1;

        // for (int i = 0; i < a.length; i++) {
        // for (int j = 0; j <= a[i].length; j++) {
        // // cont += i;
        // cont += i;
        // a[i][j] = j;
        // // System.out.println(Arrays.toString(a));
        // // System.out.println(a[i][j]);
        // // a[j][i] =j ;
        // System.out.println("[ " + Arrays.toString(a[cont]));

        // }

        // }

        int[][] matriz;
        matriz = new int[NUM_ROW][NUM_COL];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i == j) ? 1 : 0;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();//
        }

    }

}
