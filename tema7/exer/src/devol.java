import java.util.Arrays;

public class devol {

    // Diapositiva 40-41

    public static int[] rellenaCeroPares(int[] vector) {
        for (int i = 0; i < vector.length; i += 2) {
            vector[i] = 0;
        }

        return vector;
    }

    public static int[] rellenaCeroPares2(int[] vector) {
        int[] array = new int[vector.length];// genero una array con una direccion nueva
        for (int i = 0; i < vector.length; i += 2) {
            array[i] = 0;
        }
        return array;

    }

    /**
     * ~Buscar un elemetnto de la array sabiendo que esta ordeando
     * Necitarimaos un entro y un booleano
     * 
     * @param
     */
    public static int busquedaBinaria(int[] array, int numero) {
        int centro;
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio <= fin) {//
            // centro = array.length / 2;
            centro = (inicio + fin) / 2;
            if (array[centro] == numero) {
                return centro;
            } else if (array[centro] > numero) {
                fin = centro - 1;
            } else {
                inicio = centro + 1; // devolvemos la posicion que es centro, si no es mayor oes menor es porque ya
                                     // esta encontrado.
            }
        }
        return -1;
    }

    public static int busquedaBinaria2(int[] array, int numero) {
        int centro;
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio <= fin) {//
            // centro = array.length / 2;
            centro = (inicio + fin) / 2;
            if (array[centro] == numero) {
                return centro;
            } else if (array[centro] > numero) {
                fin = centro - 1;
            } else {
                inicio = centro + 1; // devolvemos la posicion que es centro, si no es mayor oes menor es porque ya
                // esta encontrado.
            }
        }
        return -1;
    }

    // encontrar 3 maneras diferentes de buscar elementos de un array una es el for
    // hacer dos metodos de busqueda de arrays y ordenacion de arrays;

    public static void main(String[] args) {

        final int N_ELEMENTOS = 20;
        int array[] = new int[N_ELEMENTOS];

        int resultado[];
        int resultado2[];

        // generacion de valores en los arrays mediante metodos
        resultado = rellenaCeroPares(array);// este medoto genera los valores del array mediante el for.
        resultado2 = rellenaCeroPares2(array); // este metodo imprime los mismo valores pero con diferente direccion.

        // imprime caracteres de los valores
        System.out.println(Arrays.toString(array)); // imprime el array con el java.util.arrays.
        System.out.println(Arrays.toString(resultado)); // imprime el array con el for.
        System.out.println(Arrays.toString(resultado2));// imprime el mismo array pero con nueva direccion.

        // imprime direcciones
        System.out.println(array);
        System.out.println(resultado);
        System.out.println(resultado2);

        int a[] = new int[N_ELEMENTOS];
        int i = 0;
        while (i < 4) {
            i++;
        }

        System.out.print(a[i]);
        // array[3] = 5;

        System.out.println(busquedaBinaria(array, 0));
        System.out.println(busquedaBinaria2(array, 2));

    }

}
