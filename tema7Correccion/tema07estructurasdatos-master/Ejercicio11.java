public class Ejercicio11 {

   public static void execute() {
      String nom;
      String cognom1, cognom2;
      String nomComplet;
      String nomCompletMinuscules;
      System.out.print("Nom: ");
      nom = Main.lector.nextLine();
      System.out.print("Cognom1: ");
      cognom1 = Main.lector.nextLine();
      System.out.print("Cognom2: ");
      cognom2 = Main.lector.nextLine();
      nomComplet = nom + " " + cognom1 + " " + cognom2;
      nomCompletMinuscules = nomComplet.toLowerCase();
      System.out.println(nomCompletMinuscules);
      System.out.println(nomComplet.toUpperCase());
      System.out.println(nomComplet.length());
      if(nomComplet.length() >= 5) {
         System.out.println(nomComplet.substring(0,5));
      }
      if(nomComplet.length() >= 2) {
         System.out.println(nomComplet.substring(nomComplet.length() - 2, nomComplet.length()));
      }
      System.out.println("Ocurrencias de " + nomComplet.charAt(nomComplet.length()-1) +
          ": " + nApariciones(nomComplet.charAt(nomComplet.length()-1), nomComplet));


      System.out.println(nomCompletMinuscules.replace(nomCompletMinuscules.charAt(0), Character.toUpperCase(nomCompletMinuscules.charAt(0))));
      System.out.println("***" + nomComplet + "***");
      for(int i = nomComplet.length() - 1; i >= 0; i--) {
         System.out.print(nomComplet.charAt(i));
      }
      System.out.println("");
   }

   /**
    * Calcula el número de veces que aparece el carácter c en el String s
    * @param c 
    * @param s
    * @return Número de veces que se repite el carácter
    */
   public static int nApariciones(char c, String s) {
      int nVeces = 0;
      for(int i = 0; i < s.length(); i++) {
         if(s.charAt(i) == c) {
            nVeces++;
         }
      }
      return nVeces;
   }
}