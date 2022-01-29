import java.util.Scanner;

public class Ejercicio01 {
   static Scanner lector;

   public static void execute() {
      String frase;
      String[] palabras;
      StringBuilder nuevaFrase = new StringBuilder();
      System.out.println("Escribe una frase: ");
      frase = Main.lector.nextLine();
      palabras = frase.split(" ");
      for (String palabra : palabras) {
         nuevaFrase.append(palabra.replaceFirst(String.valueOf(palabra.charAt(0)),
               String.valueOf(Character.toUpperCase(palabra.charAt(0)))));
         nuevaFrase.append(" ");
      }
      System.out.println(nuevaFrase);
   }
}