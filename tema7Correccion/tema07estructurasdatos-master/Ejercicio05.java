public class Ejercicio05 {
   public static void execute() {
      String frase;
      System.out.print("Frase: ");
      frase = Main.lector.nextLine();
      System.out.println("La palabra más larga es " + palabraMasLarga(frase));
   }

   public static String palabraMasLarga(String frase) {
      String[] palabras = frase.split(" ");
      int mayor = 0;
      String palabra = "";
      for(int i = 0; i < palabras.length; i++) {
         if(mayor < palabras[i].length()) {
            mayor = palabras[i].length();
            palabra = palabras[i];
         }
      }
      return palabra;
   }

}