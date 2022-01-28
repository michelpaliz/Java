import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BusquedaOrdenacion {
   public enum MetodoOrdenacion {
      BURBUJA, INSERCION, SELECCION, QUICKSORT
   }
   public static int[] v;
   public static Scanner lector = new Scanner(System.in);
   public static final int N_DATOS = 20;
   public static int iteraciones;
   public static MetodoOrdenacion ordenacion = MetodoOrdenacion.BURBUJA; 

   public static void main(String[] args) {
      int opcion;
      int num;
      int posicion;
      int opcionMetodos;
      v = new int[N_DATOS];            
      do {
         opcion = mostrarMenu();
         rellenarArray(v, 1, v.length);
         switch(opcion) {
            case 1:
               mostrarArray(v);
               num = pedirNumero();
               posicion = busquedaLineal(v, num);
               if(posicion >= 0) {
                  System.out.println("El número " + num + " está en la posición " + posicion + " (v[" +posicion+ "] = " + v[posicion]+")");                  
               } else {
                  System.out.println("El número " + num + " no está en el vector");
               }
               mostrarIteraciones();
               pausa();
               break;
            case 2:
               ordenar(v);               
               mostrarArray(v);
               num = pedirNumero();
               posicion = busquedaLinealOrdenado(v, num);
               if(posicion >= 0) {
                  System.out.println("El número " + num + " está en la posición " + posicion + " (v[" +posicion+ "] = " + v[posicion]+")");                  
               } else {
                  System.out.println("El número " + num + " no está en el vector");
               }
               mostrarIteraciones();
               pausa();
               break;
            case 3:
               ordenar(v);
               mostrarArray(v);
               num = pedirNumero();
               posicion = busquedaDicotomica(v, num);
               if(posicion >= 0) {
                  System.out.println("El número " + num + " está en la posición " + posicion + " (v[" +posicion+ "] = " + v[posicion]+")");                  
               } else {
                  System.out.println("El número " + num + " no está en el vector");
               }
               mostrarIteraciones();
               pausa();
               break;
            case 4:
               opcionMetodos = mostrarMenuMetodos();
               switch(opcionMetodos) {
                  case 1:
                     ordenacion = MetodoOrdenacion.BURBUJA;
                     break;
                  case 2:
                     ordenacion = MetodoOrdenacion.INSERCION;
                     break;
                  case 3:
                     ordenacion = MetodoOrdenacion.SELECCION;
                     break;
                  case 4:
                     ordenacion = MetodoOrdenacion.QUICKSORT;
                     break;                  
               }               
               break;
            case 0:
               System.out.println("Hasta pronto!");
               break;  
         }
      } while(opcion != 0);
   }

   /**
    * Rellena el array con números enteros aleatorios
    * @param vector Array a rellenar
    */
   public static void rellenarArray(int[] vector, int min, int max) {
      for(int i = 0; i < v.length; i++) {
         vector[i] = aleatorio(min, max);
      }
   }

   /**
    * Genera un número aleatorio entre min y max
    * @param min Número mínimo a generar
    * @param max Número máximo a generar
    * @return Número aleatorio generado
    */
   public static int aleatorio(int min, int max) {
      Random r = new Random();
      return r.nextInt(max - min + 1) + min;
   }

   /**
    * Muestra el contenido de un array
    * @param v Array a mostrar
    */
   public static void mostrarArray(int[] v) {
      System.out.println("v = " + Arrays.toString(v));
   }

   /**
    * Solicita por teclado un número al usuario
    * @return El número introducido por el usuario
    */
   public static int pedirNumero() {
      int num;
      System.out.print("Introduce el número a buscar: ");
      num = lector.nextInt();
      lector.nextLine();
      return num;
   }

   /**
    * Muestra el valor de la variable iteraciones
    * @return
    */
   public static void mostrarIteraciones() {
      System.out.println("(" + iteraciones + " iteraciones)");
   }

   /**
    * Muestra el menú al usuario principal de la aplicación, solicita una opción y comprueba que sea válida
    * @return La opción (validada) introducida por el usuario
    */
   public static int mostrarMenu() {
      boolean validado;
      int opcion;
      do {
         borrarPantalla();
         System.out.println("************************");
         System.out.println("** Búsqueda en arrays **");
         System.out.println("************************");
         System.out.println("1. Búsqueda lineal");
         System.out.println("2. Búsqueda lineal en array ordenado");
         System.out.println("3. Búsqueda binaria o dicotómica en array ordenado");
         System.out.println("4. Cambiar método de ordenación [" + ordenacion + "]");
         System.out.println("--------------------------------------------------");
         System.out.println("0. Salir");
         System.out.print("\nElige una opción: ");
         opcion = lector.nextInt();
         lector.nextLine();
         validado = opcion >= 0 && opcion <= 4;
         if(!validado) {
            System.out.println(opcion + " no es una opción válida.");
            pausa();
         } 
      } while(!validado);
      return opcion;
   }

   public static int mostrarMenuMetodos() {
      boolean validado;
      int opcion;
      do {
         borrarPantalla();
         System.out.println("***************************");
         System.out.println("** Métodos de ordenación **");
         System.out.println("***************************");
         System.out.println("1. Burbuja");
         System.out.println("2. Inserción");
         System.out.println("3. Selección");
         System.out.println("4. Quicksort");
         System.out.println("--------------------------------------------------");
         System.out.println("0. Volver al menú principal");
         System.out.print("\nElige una opción: ");
         opcion = lector.nextInt();
         lector.nextLine();
         validado = opcion >= 0 && opcion <= 4;
         if(!validado) {
            System.out.println(opcion + " no es una opción válida.");
            pausa();
         } 
      } while(!validado);
      return opcion;
   }

   public static void borrarPantalla() {
      System.out.print("\u001B[H\u001B[2J");  
      System.out.flush();      
   }

   /**
    * Muestra un mensaje solicitando que se pulse la tecla INTRO para continuar
    */
   public static void pausa() {
      System.out.println("Pulsa INTRO para continuar ...");
      lector.nextLine();
   }

   /**
    * Realiza una búsqueda lineal en un array que puede no estar ordenado
    * @param vector Array sobre el que se realizará la búsqueda
    * @param num Número a buscar
    * @return La posición donde se encuentra el número buscado o -1 si no se encuentra 
    */
   public static int busquedaLineal(int[] vector, int num) {
      iteraciones = 0;
      for(int i = 0; i < vector.length; i++) {         
         iteraciones++;
         if(vector[i] == num) { /** Si lo encontramos devolvemos la posición */
            return i;
         }         
      }
      return -1;
   }

   /** Realiza una búsqueda lineal en un array ordenado
    * @param vector Array sobre el que se realizará la búsqueda
    * @param num Número a buscar
    * @return La posición donde se encuentra el número buscado o -1 si no se encuentra 
    */
   public static int busquedaLinealOrdenado(int[] vector, int num) {
      iteraciones = 0;
      for(int i = 0; i < vector.length; i++) {
         iteraciones++;
         if(vector[i] == num) { /** Lo hemos encontrado */
            return i;
         } else if(vector[i] > num) { /** Si el número buscado es mayor que el elemento actual ya sabemos que no está */
            return -1;
         }         
      }
      return -1;
   }

   /**
    * Realiza una búsqueda binaria o dicotómica en un array ordenado
    * @param vector Array sobre el que se realizará la búsqueda
    * @param num Número a buscar
    * @return La posición donde se encuentra el número buscado o -1 si no se encuentra
    */
   public static int busquedaDicotomica(int[] vector, int num){
      int centro;
      int inf = 0;
      int sup = vector.length - 1;
      iteraciones = 0;
       while(inf <= sup) {
         iteraciones++;
         centro = (sup + inf) / 2;
         if(vector[centro] == num) {
            return centro;
         } else if(num < vector[centro] ){
            sup = centro - 1;
         } else {
            inf = centro + 1;
         }         
       }
       return -1;
   }

   /**
    * Ordena un vector mediante el método de la burbuja
    * @param vector Array a ordenar
    */
   public static void ordernaBurbuja(int[] vector) {
      boolean hayCambios = true;
      while(hayCambios) {
         hayCambios = false;
         for(int i = 0; i < vector.length - 1; i++) {
            //Si el elemento actual es mayor que el elemento siguiente los intercambiamos
            if(vector[i] > vector[i+1]) {
               intercambio(v, i, i+1);
               hayCambios = true;
            }
         }
      }
   }

   /**
    * Ordena un array mediante el método de inserción
    * @param vector
    */
   public static void ordenaInsercion(int[] vector) {
      int aux;
      int j;
      for(int i = 1; i < vector.length; i++) {
         aux = vector[i]; //Guardamos el elemento actual
         j = i - 1; //Mediante j apuntamos al elemento anterior al actual
         //Mientras queden posiciones y aux sea menor que los que tiene a su izquierda
         //los desplazamos a la derecha
         while((j >= 0) && (aux < vector[j])) { 
            vector[j+1] = vector[j];
            j--;            
         }
         //Colocamos a aux en el sitio que le corresponde
         vector[j+1] = aux;
      }
   }

   /**
    * Orderna un array mediante el método de selección
    * @param vector
    */
   public static void ordenaSeleccion(int[] vector) {
      int min;
      int pos;
      for(int i = 0; i < v.length-1; i++) {
         //Elegimos como el mínimo el elemento
         min = vector[i];
         pos = i; //Guardamos la posición del supuesto mínimo
         for(int j = i+1; j < v.length; j++) {
            if(vector[j] < min) {
               min = vector[j];
               pos = j;
            }
         }
         //Si se ha encontrado algún elemento menor los intercambiamos
         if(pos != i) {
            intercambio(vector, i, pos);
         }
      }
   }

   /**
    * Ordena un vector mediante el método Quicksort (algoritmo recursivo)
    * El método realiza llamadas recursivas ordenando el subvector comprendido
    * entre izquierda y derecha
    * @param vector Array que queremos ordenar
    * @param izquierda Posición de inicio del subvector (incialmente será 0)
    * @param derecha Posición final del subvector (inicialmente será vector.length -1)
    */
   public static void ordenaQuicksort(int[] vector, int izquierda, int derecha) {
      //1. Elegimos el pivote
      int pivote = vector[izquierda];
      //2. Los elementos mayores al pivote van a su derecha, los menores a su izquierda
      //esta parte de la implementación es el corazón del ordenamiento
      //se utilizan variables auxiliares:
      //- i para controlar los elementos a la izquierda del pivote
      //- j para controlar los elementos a la derecha del pivote
      int i = izquierda;
      int j = derecha;      
      //mientras los indices no se crucen
      while (i < j) {
          //mientras que el elemento vector[i] sea menor o igual al pivote
          //se aumenta el valor de i
          //cuando el bucle finalice, el elemento en vector[i] es mayor que pivote y deberá ir a su derecha
          while (vector[i] <= pivote && i < j) {
              i++;
          }
          //mientras que el elemento vector[j] sea mayor al pivote
          //se desminuye el valor de j
          //cuando el bucle finalice, el elemento en vector[j] es menor o igual a pivote y deberá ir a su izquierda
          while (vector[j] > pivote) {
              j--;
          }
          //siempre y cuando i sea menor a j, se hace un cambio de los elementos
          //ya que el elemento en vector[i] debe ir a la derecha y vector[j] a la izquierda
          if (i < j) {
             intercambio(v, i, j);              
          }
      }
      //En este punto v[j] es menor o igual al pivote, actualizamos la posición del pivote,
      //trasladando vector[j] a la ubicación del pivote y viceversa
      vector[izquierda] = vector[j];
      vector[j] = pivote;
      //3. Para V1 y V2, aplicar el mismo proceso.
      if (izquierda < j - 1) {
          //Quicksort aplicado a V1
          ordenaQuicksort(vector, izquierda, j - 1);
      }
      if (j + 1 < derecha) {
          //Quicksort aplicado a V2
          ordenaQuicksort(vector, j + 1, derecha);
      }
   }

   public static void intercambio(int[] vector, int i, int j) {
      int aux = vector[i];
      vector[i] = vector[j];
      vector[j] = aux;
   }

   public static void ordenar(int[] vector) {
      switch(ordenacion) {
         case BURBUJA:
            ordernaBurbuja(vector);
            break;
         case INSERCION:
            ordenaInsercion(vector);
            break;
         case SELECCION:
            ordenaSeleccion(vector);
            break;
         case QUICKSORT:
            ordenaQuicksort(vector, 0, vector.length-1);
            break;
      }
   }
}