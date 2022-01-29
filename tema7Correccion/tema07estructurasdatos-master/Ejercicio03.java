public class Ejercicio03 {
   public static void execute() {
      String frase;
      System.out.print("Frase: ");
      frase = Main.lector.nextLine();
      System.out.println("La frase " + frase + " tiene " + nPalabras(frase) + " palabras");
   }

   public static int nPalabras(String frase) {
      return frase.split(" ").length;
   }
}