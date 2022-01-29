public class Ejercicio10 {
   public static void execute() {
      String frase;
      System.out.print("Frase: ");
      frase = Main.lector.nextLine();
      if(esPalindromo(frase)) {
         System.out.println(frase + " es palíndromo.");
      } else {
         System.out.println(frase + " no es palíndromo.");
      }
   }

   public static boolean esPalindromo(String frase) {
      boolean match = true;
      int j;
      int i = 0; //Límite inferior
      //Eliminamos espacios en blanco
      frase = frase.replaceAll("\\s", "");
      //Convertimos a minúsculas
      frase = frase.toLowerCase();
      //Eliminamos acentos
      frase = eliminarAcentos(frase);
      //Establecemos el límite superior
      j = frase.length() - 1;
      while(match && i < frase.length()) {
         match = frase.charAt(i) == frase.charAt(j);
         i++;
         j--;
      }
      return match;
   }

   public static String eliminarAcentos(String frase) {
      String origen = "àáèéìíòóùú";
      String destino = "aaeeiioouu";
      for(int i = 0; i < origen.length(); i++) {
         frase = frase.replace(origen.charAt(i), destino.charAt(i));
      }
      return frase;
   }
}