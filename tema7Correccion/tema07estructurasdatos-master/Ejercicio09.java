public class Ejercicio09 {
   public static void execute() {
      String frase;
      System.out.print("Frase: ");
      frase = Main.lector.nextLine(); 
      for(int i = 1; i < frase.length(); i += 2) {
         System.out.print(frase.charAt(i));
      }
   }
}