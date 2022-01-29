public class Ejercicio07 {
   public static void execute() {
      String frase;
      String[] palabras;
      System.out.print("Frase: ");
      frase = Main.lector.nextLine();
      palabras = frase.split("\\s+");
      for(String palabra: palabras) {
         System.out.println(palabra);
      }
   }
}