package libs;

public class matrizlib {

    // NO puedo devolver el valor del return
    // public static int[][] matrizInt(int [][] matriz) {
    // for (int i = 0; i < matriz.length; i++) {
    // for (int j = 0; j < matriz[i].length; j++) {
    // return matriz[i][j] = j;
    // }
    // }

    // }

    public static void cerosyUnost(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i == j) ? 1 : 0;
            }
        }

    }

    public static void mostrarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

        }
    }

}
