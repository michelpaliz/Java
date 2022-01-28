import libs.inverse;
import libs.matrizlib;
import twoDimensionalArray.user;

import java.util.Arrays;
import java.util.Scanner;

public class exer26 {

    public static final int NUM_ROW = 4;
    public static final int NUM_COL = 8;
    public static Scanner myInput = new Scanner(System.in);
    // public static int user = Integer.parseInt(myInput.nextLine());

    public static void main(String[] args) {

        // representar toda la matriz

        System.out.println("Mostrar Matriz\n");

        int[][] matriz = new int[NUM_ROW][NUM_COL];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = j;
            }
        }

        matrizlib.mostrarMatriz(matriz);
        System.out.println();

        // b) matriz traspuesta por columnas
        System.out.println("Matriz traspuesta por columnas");

        int[][] arr = { { 1, 2 },
                { 3, 4 },
                { 5, 6 } };

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[arr.length - 1 - i][j] + " ");
            }
            System.out.println();
        }

        // no funciona
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[matriz.length - 1 - i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // c) La matriz por filas con la suma total de cada fila
        System.out.println("La matriz por filas con la suma total de cada fila");
        int sumaFilas = 0;

        // i es como el recorredor de columnas y j como el de filas
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sumaFilas += arr[i][j];
                System.out.print("\n La suma de fila " + i + j + " es : " + sumaFilas);
            }
            System.out.println();

        }

        // d valores maximos y minimos de una matriz;
        System.out.println("\nCalcular el mayor valor de la matriz y el menor\n");
        int max;
        int min;
        int filaMayor, filaMenor, colMayor, colMenor;
        max = min = arr[0][0]; // ~ Se toma el primer elemento de la matriz como mayor y menor
        filaMayor = filaMenor = colMayor = colMenor = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    filaMayor = i;
                    colMayor = j;
                } else if (arr[i][j] < min) {
                    min = arr[i][j];
                    filaMenor = i;
                    colMenor = j;
                }
            }
        }

        // Mostrar por pantalla el mayor elemento de la matriz,el menor y las posiciones
        // que ocupan
        System.out.print("Elemento mayor: " + max);
        System.out.println(" Fila: " + filaMayor + " Columna: " + colMayor);
        System.out.print("Elemento menor: " + min);
        System.out.println(" Fila: " + filaMenor + " Columna: " + colMenor);

        // La madia de toda una matriz
        int suma = 0;
        int promedio = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                suma += arr[i][j];
                promedio = suma / arr.length;
            }
        }

        System.out.print("\nEl promedio de la matriz es : " + promedio + "\n\n");

        // f el elemento que nos indicque el usuario dime la fila y la columna

        user.userInt(NUM_ROW, NUM_COL, matriz);

        boolean correct;
        int userColumna;
        int userFila;

        do {
            System.out.println("\nEl elemento que indique el usuario");
            System.out.println("Dime la columna ");
            userColumna = Integer.parseInt(myInput.nextLine());
            System.out.println("Dime la fila ");
            userFila = Integer.parseInt(myInput.nextLine());

            correct = ((userColumna <= matriz.length && userFila <= matriz.length));
            if (!correct) {
                System.out.println("El array no tiene ese rango");
            }
        } while (!correct);

        System.out.println("A[" + userColumna + "][" + userFila + "]");

        for (int i = 0; i < matriz.length; ++i) {
            for (int j = 0; j < matriz[i].length; ++j) {
                matriz[i][j] = (i == userColumna && j == userFila) ? (matriz[i][j]) : 0;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // g la fila nos indique el usuario

        System.out.println("Sacame las filas que el usuario quiere de la matriz");

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j <= arr[i].length; ++j) {
                // matriz[i][j] = (i == 1) ? (matriz[1][j]) : 0;

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // h la columna que nos indique el usuario
        int fila;
        System.out.println("Dime la fila que quieras ver");
        fila = myInput.nextInt();
        myInput.nextLine();
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[fila][i] + " ");
        }
        System.out.println();

        // j Guarda en la columna 8 el total de todas las anteriores
    }
}
