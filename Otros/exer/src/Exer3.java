import java.util.Scanner;

public class Exer3 {

    public static final String frase1 = "Acabar y  terminar ";
    public static final String frase2 = "Armonía y  calma  ";
    public static final String frase3 = "Invariabilidad y  uniformidad  ";
    public static final String frase4 = "Economizar y  ahorrar ";
    public static final String frase5 = "Destruir y  corromper  ";
    public static final String frase6 = "Tierno y  cariñoso ";
    public static final String frase7 = "Importe y  soporte ";
    public static final String frase8 = "Llano y  llanto";

    public static String positivo = "VERDADERO";
    public static String negativo = "FALSO";

    public static Scanner myInput = new Scanner(System.in);
    public static boolean correct;

    // public static enum frases {
    // FRASE1, FRASE2, FRASE3, FRASE4, FRASE5, FRASE6, FRASE7, FRASE8
    // };

    public static void showPhrases() {
        System.out.println("************FRASES**********");
        String format = "%-10S %-5d  %10S";
        String concepto = "FRASE ";
        System.out.printf(format, concepto, 1, frase1 + "\n");
        System.out.printf(format, concepto, 2, frase2 + "\n");
        System.out.printf(format, concepto, 3, frase3 + "\n");
        System.out.printf(format, concepto, 4, frase4 + "\n");
        System.out.printf(format, concepto, 5, frase5 + "\n");
        System.out.printf(format, concepto, 6, frase6 + "\n");
        System.out.printf(format, concepto, 7, frase7 + "\n");
        System.out.printf(format, concepto, 8, frase8 + "\n");

    }

    public static String check(String fraseName, String user) {

        String conversion;

        if (fraseName == frase1 || fraseName == frase5 || fraseName == frase7 || fraseName == frase8) {
            fraseName = negativo;
            conversion = negativo;
        } else {
            fraseName = positivo;
            conversion = positivo;
        }

        if (user != fraseName) {
            return ("La respuesta es incorrecta, la respuesta correcta es " + conversion);

        } else {
            return ("La respuesta es correcta");
        }

    }

    public static String menu() {
        String frase = "";

        int userInt;
        showPhrases();

        do {
            System.out.println("Escoge una frase del 1 al 8");
            userInt = Integer.parseInt(myInput.nextLine());
            System.out.println("La respuesta del usuario es " + userInt);

            correct = userInt <= 8 && userInt > 0;
            if (!correct) {
                System.out.println("La respuesta debe estar comprendido entre el 1  al 8");
            }

        } while (!correct);

        switch (userInt) {
            case 1:
                frase = frase1;
                break;
            case 2:
                frase = frase2;
                break;
            case 3:
                frase = frase3;
                break;
            case 4:
                frase = frase4;
                break;
            case 5:
                frase = frase5;
                break;
            case 6:
                frase = frase6;
                break;
            case 7:
                frase = frase7;
                break;
            case 8:
                frase = frase8;
                break;
        }

        System.out.print("La frase que has escogido\n*** " + frase + "****" + "\n");
        return frase;
    }

    public static void main(String[] args) {

        // MOSTRAR MENU

        // System.out.print(menu());

        String resultado = menu();

        System.out.println("Este es el valor de resultado " + resultado);

        // boolean correct;
        String user;

        System.out.println("INTRODUCE TU RESPUESTA DEBE SER FALSO O VERDADERO");
        do {
            user = myInput.nextLine();
            user = user.replaceAll("\\s", "");
            user = user.toUpperCase();
            System.out.println("Esta es la respuesta que el usuario ha escogido " + user);
            correct = user.contentEquals("FALSO") || user.contentEquals("VERDADERO"); // chekea si el valor tiene la
                                                                                      // mismos valores char
            // ~System.out.println("Este es el valor de correct " + correct);
            if (!correct) {
                System.out.println("Porfavor intruduce una respuesta valida FALSO O VERDADERO");
            }

        } while (!correct); // si correct es verdadero te dejara pasar;

        // ~ System.out.println("LA RESPUESTA DE USER EN ESTE MOMENTO ES " + user);

        // aqui igualamos los valores
        if (user.contentEquals("FALSO")) {
            user = negativo;
        } else if (user.contentEquals("VERDADERO")) {
            user = positivo;
        }

        System.out.println(check(resultado, user));

        // String format = "%-20S\n %-20S\n %-20S\n %-20S\n %-20S\n %-20S\n %-20S\n
        // %-20S\n ";
        // System.out.printf(format, frase1, frase2, frase3, frase4, frase5, frase6,
        // frase7, frase8);

        // System.out.println(user.getClass().getSimpleName());
        // System.out.println(negativo.getClass().getSimpleName());

        // System.out.println(user.chars().count());
        // System.out.println(negativo.chars().count());

    }

}
