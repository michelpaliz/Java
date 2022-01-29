public class Ejercicio08 {
   public static void execute() {
      String frase;
      String[] palabras;
      int tamanyoColumna;
      int nDecimales;
      System.out.print("Frase: ");
      frase = Main.lector.nextLine();
      palabras = frase.split("\\s+");
      //Aprovechamos el método realizado en el Ejercicio5
      tamanyoColumna = Ejercicio5.palabraMasLarga(frase).length();
      nDecimales = String.valueOf(tamanyoColumna).length();  
      for(String palabra: palabras) {
         System.out.printf("%-"+tamanyoColumna+"s %" + nDecimales + "d\n",palabra, palabra.length());
      }
   }
}