package twoDimensionalArray;

import java.util.Scanner;

public class user {

    public static Scanner myInput = new Scanner(System.in);

    public static void userInt(int NUM_ROW, int NUM_COL, int[][] matriz) {
        // Lectura con es scanner
        System.out.println("Lectura por teclado de elementos de la matriz");

        for (int i = 0; i < NUM_ROW; i++) {
            for (int j = 0; j < NUM_COL; j++) {
                System.out.print("A[" + i + "][" + j + "]= ");
                matriz[i][j] = myInput.nextInt();
            }
        }

        System.out.println("valores introducidos:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

}
