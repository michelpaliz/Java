import java.util.Arrays;
import java.util.Random;

public class Ejercicio21 {
   public static void execute() {
      final int N_ELEMENTOS = 10;
      int[] v = new int[N_ELEMENTOS];
      int opcion;
      do {
         opcion = mostrarMenu();
         switch(opcion) {
            case 0:
               System.out.println("Fins aviat!");
               break;
            case 1:
               crearArray(v);
               System.out.println("L'array s'ha inicialitzat amb " + N_ELEMENTOS + " valors aleatoris");
               pausa();
               break;
            case 2:
               visualitzarArray(v);
               pausa();
               break;
            case 3:
               visualitzarParell(v);
               pausa();
               break;
            case 4:
               visualitzarMultiple3(v);
               pausa();
               break;
         }
      } while (opcion != 0);      
   }
   //El nombre no es muy significativo, ya que no crea un array
   //sino que lo rellena con datos aleatorios, pero el nombre del
   //método venía impuesto por el enunciado
   /**
    * Rellena el array v con números aleatorios
    * @param vector Array a rellenar
    */
   public static void crearArray(int[] v) {
      for(int i = 0; i < v.length; i++) {
         v[i] = alea(0,50);
      }
   }
   /**
    * Muestra el array pasado como parámetro
    * @param vector
    */
   public static void visualitzarArray(int[] vector) {
      //Dos formas de hacerlo
      //1. Recorrer el array e imprimir cada elemento
      System.out.print("[");
      for(int i = 0; i < vector.length; i++) {
         if(i!=0) {
            System.out.print(", ");
         }
         System.out.print(vector[i]);         
      }
      System.out.println("]");

      //2. Utilizar el método toString de la clase Arrays.
      //Arrays.toString(vector);
   }
   /**
    * Muestra los elementos del vector que son pares
    * @param vector
    */
   public static void visualitzarParell(int[] vector) {      
      int cont = 0;
      for(int i = 0; i < vector.length; i++) {
         if(vector[i] % 2 == 0) {
            if(cont != 0) {
               System.out.print(", ");
            }
            System.out.print("v[" + i + "] = " + vector[i]);
            cont++;
         }
      }
      System.out.println("");
   }
   /**
    * Muestra los elementos del vector que son múltiplos de 3
    * @param vector
    */
   public static void visualitzarMultiple3(int[] vector) {
      int cont = 0;
      for(int i = 0; i < vector.length; i++) {
         if(vector[i] % 3 == 0) {
            if(cont !=0) {
               System.out.print(", ");
            }
            System.out.print("v[" + i + "] = " + vector[i]);
            cont++;
         }
      }
      System.out.println("");
   }
   /**
    * Genera un número entero aleatorio entre min y max
    * @param min Número mínimo a ser generado
    * @param max Número máximo a ser generado
    * @return Número entero aleatorio generado
    */
   public static int alea(int min, int max) {
      Random r = new Random();
      return r.nextInt(max - min + 1) + min;
   }
   /**
    * Muestra el menú principal de la aplicación, solicita un número
    * de opción y comprueba que esté comprendido entre los posibles valores
    * @return Devuelve la opción seleccionada por el usuario
    */
   public static int mostrarMenu() {
      int opcion;
      boolean validado;
      do {
         esborrarPantalla();
         System.out.println("MENÚ PRINCIPAL");
         System.out.println("==============");
         System.out.println("1. Omplir array");
         System.out.println("2. Visualitzar contingut de l'array");
         System.out.println("3. Visualitzar contingut parell");
         System.out.println("4. Visualitzar contingut múltiple de 3");
         System.out.println("--------------------------------------");
         System.out.println("0. Eixir del menú");
         System.out.print("Selecciona una opció: ");
         opcion = Main.lector.nextInt();
         Main.lector.nextLine();
         validado = opcion >= 0 && opcion <= 4;
         if(!validado) {
            System.out.println(opcion + " no és una opció vàlida.");
            pausa();            
         }
      } while(!validado);
      return opcion;
   }
   /**
    * Borra la pantalla y situa el cursor en la parte superior derecha
    * de la pantalla
    */
   public static void esborrarPantalla() {
      System.out.print("\u001B[H\u001B[2J");
      System.out.flush();
   }
   /**
    * Solicita la pulsación de la tecla INTRO.
    * Útil para parar la salida de datos por pantalla.
    */
   public static void pausa() {
      System.out.print("Prem INTRO per a continuar ...");
      Main.lector.nextLine();
   }

}