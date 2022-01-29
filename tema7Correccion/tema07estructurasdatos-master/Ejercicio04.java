import java.util.Scanner;
public class Ejercicio04 {
   public static void execute() {
      String frase;
      String[] palabras;
      int[] contador;
      System.out.print("Dime la frase: ");
      frase = Main.lector.nextLine();
      palabras = frase.split(" ");
      for(int i = 0; i < palabras.length; i++) {
         contador = contarVocalesYConsonantes(palabras[i]);
         System.out.println("Palabra: " + palabras[i]);
         System.out.println("Vocales: " + contador[0]);
         System.out.println("Consonantes: " + contador[1]);
      }
   }

   /**
     * Devuelve el número de vocales y el número de consonantes de una frase
     * 
     * @param frase
     * @return Array la primera posición indica el número de vocales y la segunda el
     *         número de consonantes
     */
    public static int[] contarVocalesYConsonantes(String frase) {
        String vocales = "aàáeèéiíìoòóuúù";
        int nVocales = 0;
        int nConsonantes = 0;
        int[] resultado = { 0, 0 };
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            if(vocales.indexOf(frase.charAt(i)) >= 0)
                nVocales++;
            else if(Character.isLetter(frase.charAt(i)))
                nConsonantes++;
        }
        resultado[0] = nVocales;
        resultado[1] = nConsonantes;
        return resultado;
    }
}