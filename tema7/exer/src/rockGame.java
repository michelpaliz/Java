import libs.userArray;
import libs.randArray;
import java.util.Scanner;

public class rockGame {

    public static int number = randArray.randomGeneratorMath(1, 3);

    public static Scanner myIput = new Scanner(System.in);

    public static void pausa() {
        System.out.println("Pulsa INTRO para continuar ...");
        myIput.nextLine();
    }

    public static void borrarPantalla() {
        System.out.print("\u001B[H\u001B[2J");
        System.out.flush();

    }

    public static int menu() {
        int user;
        boolean correct = true;
        System.out.println("PIEDRA , PAPEL , TIJERA");
        do {
            borrarPantalla();
            System.out.println("1.Nueva Partida");
            System.out.println("2.Mostrar Puntaciones");
            System.out.println("0.Salir");
            System.out.println("Elige una opcion");
            user = Integer.parseInt(myIput.nextLine());
            correct = user >= 0 && user <= 2;
            if (!correct) {
                System.out.println(user + " no es una opción válida.");
                pausa();
            }
        } while (!correct);
        return user;
    }

    public static int choose() {
        int user;
        // String userStr;
        boolean correct = true;
        System.out.println("ELIGE");
        do {
            borrarPantalla();
            System.out.println("1.Piedra");
            System.out.println("2.Papel");
            System.out.println("3.Tijera");
            System.out.println("Indica la eleccion");
            user = Integer.parseInt(myIput.nextLine());
            correct = user >= 1 && user <= 3;
            if (!correct) {
                System.out.println(user + " no es una opción válida.");
                pausa();
            }
        } while (!correct);
        // return userStr = IntergertoString();
        // return userStr = String.valueOf(user);
        return user;

    }

    public static String cpu(int number) {
        String newValue = "";

        switch (number) {
            case 1:
                // newValue = String.valueOf(number);
                newValue = "piedra";
                return (cpuReference(newValue));

            case 2:
                // newValue = String.valueOf(number);
                newValue = "papel";
                return (cpuReference(newValue));

            case 3:
                // newValue = String.valueOf(number);
                newValue = "tijera";
                return (cpuReference(newValue));

        }
        return newValue;

    }

    public static String cpuReference(String reference) {
        return ("CPU elige " + reference + "\n");
    }

    public static String userReference(String reference) {
        return ("User elige " + reference + "\n");
    }

    public static void main(String[] args) {

    }

}
