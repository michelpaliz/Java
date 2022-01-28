import libs.userArray;
import libs.check;
import libs.randArray;
import java.util.Scanner;

public class pdrpptj {

    public static int number = randArray.randomGeneratorMath(1, 3);

    public static Scanner myInput = new Scanner(System.in);

    // public static int

    // public final int userPoints = 0;

    // public static int user;

    /**
     * Muestra un mensaje solicitando que se pulse la tecla INTRO para continuar
     */
    public static void pausa() {
        System.out.println("Pulsa INTRO para continuar ...");
        myInput.nextLine();
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
            user = Integer.parseInt(myInput.nextLine());
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
        boolean correct = true;
        System.out.println("ELIGE");
        do {
            // borrarPantalla();
            System.out.println("1.Piedra");
            System.out.println("2.Papel");
            System.out.println("3.Tijera");
            System.out.println("Indica la eleccion");
            // user = Integer.parseInt(myIput.nextLine());
            user = myInput.nextInt();
            myInput.nextLine();
            correct = user >= 0 && user <= 3;
            if (!correct) {
                System.out.println(user + " no es una opción válida.");
                pausa();
            }

        } while (!correct);

        // return userStr = IntergertoString();
        return user;

    }

    // public enum Tirada {PIEDRA,PAPEL,TIJERA};
    // Tirada tirada =Tirada.PAPEL;
    public static String translate(int user) {
        String userStr;
        if (user == 1) {
            userStr = "piedra";
            return userStr;
        } else if (user == 2) {
            userStr = "papel";
            return userStr;
        } else if (user == 3) {
            userStr = "tijera";
            return userStr;
        }
    }

    public static String cpu(int number) {
        String newValue = "";

        switch (number) {
            case 1:
                // newValue = String.valueOf(number);
                newValue = "piedra";
                return ((newValue));

            case 2:
                // newValue = String.valueOf(number);
                newValue = "papel";
                return ((newValue));

            case 3:
                // newValue = String.valueOf(number);
                newValue = "tijera";
                return ((newValue));

        }
        return newValue;

    }

    public static String reference(String userRef, String cpuRef) {
        return ("\nUser elige " + userRef + " y CPU elige " + cpuRef + "\n");
    }

    public static String startGame(String cpu, String user) {
        // String cpuPoints = "draw";
        // String userPoints = "user";
        // String drawPoints = "cpu";
        if (cpu(number).equalsIgnoreCase(user)) {
            return ("Es un empate");
        } else if (user.equals("papel") && cpu(number).equals("piedra")) {
            return ("El usuario ha gando esta partida, xq papel gana a piedra");
        } else if (user.equals("piedra") && cpu(number).equals("tijera")) {
            return ("El usuario ha ganado esta partida, xq piedra gana a tijera");
        } else if (user.equals("tijera") && cpu(number).equals("papel")) {
            return ("El usuario ha ganado esta partida, xq tijera gana a papel");
        } else {
            return ("El cpu ha ganado esta partida xq " + cpu(number) + " gana ha " + user);
        }

    }

    public static void menuPoints(String check) {
        int userPoints = 0;
        int cpuPoints = 0;
        int drawPoints = 0;
        if (check.contains("usuario")) {
            userPoints++;
        } else if (check.contains("cpu")) {
            cpuPoints++;
        } else if (check.contains("empate")) {
            drawPoints++;
        }
        String format = "%-20s %10d\n";
        System.out.println("*PUNTACIONES*\n");
        System.out.printf(format, "El usuario tiene ", userPoints);
        System.out.printf(format, "El cpu tiene ", cpuPoints);
        System.out.printf(format, "Empates hay ", drawPoints);
    }

    public static void main(String[] args) {

        // user(choose());
        String newValue;
        boolean correct = true;
        int minimum = 0;

        // System.out.println(startGame(cpu(number), "piedra"));

        // System.out.println(cpu(number));

        // startGame(true, cpu(number), user((choose())));

        // while (correct) {
        switch (menu()) {
            case 1:
                switch (choose()) {
                    case 1:
                        newValue = "piedra";
                        System.out.println(reference(newValue, cpu(number)));
                        // Start GAME
                        System.out.println(startGame(cpu(number), newValue));
                        minimum++;
                        correct = false;
                        break;
                    case 2:
                        newValue = "papel";
                        System.out.println(reference(newValue, cpu(number)));
                        // Start GAME
                        System.out.println(startGame(cpu(number), newValue));
                        minimum++;
                        correct = false;
                        break;
                    case 3:
                        newValue = "tijera";
                        System.out.println(reference(newValue, cpu(number)));
                        // Start GAME
                        System.out.println(startGame(cpu(number), newValue));
                        minimum++;
                        correct = false;
                        break;
                    // if (translate(choose()).equals("piedra")) {
                    // System.out.println(reference(translate(choose()), cpu(number)));
                    // // Start GAME
                    // System.out.println(startGame(cpu(number), translate(choose())));
                    // minimum++;
                    // correct = true;
                    // } else if (translate(choose()).equals("papel")) {
                    // System.out.println(reference(translate(choose()), cpu(number)));
                    // // Start GAME
                    // System.out.println(startGame(cpu(number), translate(choose())));
                    // minimum++;
                    // correct = true;
                    // } else if (translate(choose()).equals("tijeras")) {
                    // System.out.println(reference(translate(choose()), cpu(number)));
                    // // Start GAME
                    // System.out.println(startGame(cpu(number), translate(choose())));
                    // minimum++;
                    // correct = true;
                    // }

                }

            case 2:
                if (minimum != 0) {
                    menuPoints(startGame(translate(choose()), cpu(number)));
                    pausa();
                    correct = false;
                    break;
                } else {
                    System.out.println("Necesitas jugar al menos una vez para ver los resultados");
                    pausa();
                    break;
                }
            case 0:
                System.out.println("Hasta pronto");
                break;
        }

        // }

    }

}
