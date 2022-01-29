public class Ejercicio06 {
   public static void execute() {
      String frase;
      int nVeces;
      System.out.print("Frase: ");
      frase = Main.lector.nextLine();
      System.out.print("Factor de multiplicación: ");
      nVeces = Main.lector.nextInt();
      Main.lector.nextLine();
      repiteFrase(frase, nVeces);
   }

   public static void repiteFrase(String frase, int nVeces) {
      for(int i = 0; i < nVeces; i++) {
         System.out.println(frase);
      }
   }
}