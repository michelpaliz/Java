public class Ejercicio12 {
   public static void execute() {
      String frase;
      System.out.print("Frase: ");
      frase = Main.lector.nextLine();
      System.out.println(reemplazarTexto("es", "no por", frase));
      System.out.println(reemplazarNumeros("*", frase));
   }

   /**
    * Reemplaza cada aparición de texto por reemplazo 
    * @param texto Texto a ser reemplazado
    * @param reemplazo Texto por el que se reemplazará
    * @param frase Frase donde se buscará el texto
    * @return Frase con el texto reemplazado
    */
   public static String reemplazarTexto(String texto, String reemplazo, String frase) {
      return frase.replace(texto, reemplazo);
   }

   /**
    * Reemplaza los números (de cualquier longitud) que aparezcan en frase
    * por el texto especificado en reemplazo
    * @param reemplazo 
    * @param frase
    * @return Frase con los números reemplazados por el texto reemplazo.
    */
   public static String reemplazarNumeros(String reemplazo, String frase) {
      return frase.replaceAll("\\d+", reemplazo);
   }
}