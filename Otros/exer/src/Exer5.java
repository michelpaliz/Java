import java.util.Scanner;

public class Exer5 {

    public static Scanner myInput = new Scanner(System.in);
    public static final int NUMERO_MAXIMO = 7;
    public static final int NUMERO_MINIMO = 0;
    public static final int MAX_PRINCIPAL = 3;
    public static final int MAX_INTENTOS = 3;
    public static int user;
    public static boolean correct;
    public static String strUser;
    public static int ganado = 0;
    public static int perdido = 0;

    public enum Preguntas {
        ONE {
            public String toString() {
                return "****¿Cual fue el día mas feliz para el?";
            }
        },
        TWO {
            public String toString() {
                return "****¿Que es lo que mas desea el?";
            }
        },
        THREE {
            public String toString() {
                return "****¿Cual es el sobrenombre que mas le gusta?";
            }
        },
        FOUR {
            public String toString() {
                return "****¿Que le gusta hacer en tiempo libre?";
            }
        },
        FIVE {
            public String toString() {
                return "****¿Cuantos hijos quiere tener?";
            }
        },
        SIX {
            public String toString() {
                return "****¿Que es lo que mas desea el?";
            }
        },
        SEVEN {
            public String toString() {
                return "****¿Elige una opcion  ?";
            }
        }
    }

    public static int menuJuego() {
        int numero = 0;

        System.out.println("*******MENU PRINCIPAL *******");
        do {
            System.out.println("Elige un numero del 1 al 7");
            user = Integer.parseInt(myInput.nextLine());
            correct = user > NUMERO_MINIMO && user <= NUMERO_MAXIMO;
            if (!correct) {
                System.out.println(
                        "La respuesta no es correcta escoge un numero entre " + NUMERO_MAXIMO + " y " + NUMERO_MINIMO);
            }
        } while (!correct);
        System.out.println("Esta es tu respuesta " + user);
        switch (user) {
            case 1:
                System.out.println(Preguntas.ONE);
                System.out.println("**Escoge una opcion**");
                System.out.println(
                        "1.El dia que me comi a mi chepita\n2.El dia que conoci a mi princesita\n3.El dia que te pegue");
                user = Integer.parseInt(myInput.nextLine());
                numero = 1;
                break;
            case 2:
                System.out.println(Preguntas.TWO);
                System.out.println("**Escoge una opcion**");
                System.out.println("1.Mi chepita\n2.Mi princesita\n3.Jax");
                user = Integer.parseInt(myInput.nextLine());
                numero = 2;
                break;
            case 3:
                System.out.println(Preguntas.THREE);
                System.out.println("**Escoge una opcion**");
                System.out.println("1.Amor\n2.Cielo \n3.Esposo");
                user = Integer.parseInt(myInput.nextLine());
                numero = 3;
                break;
            case 4:
                System.out.println(Preguntas.FOUR);
                System.out.println("**Escoge una opcion**");
                System.out.println("1.Ir al cine\n2.Ir a comer\n3.Leer");
                user = Integer.parseInt(myInput.nextLine());
                numero = 4;
                break;
            case 5:
                System.out.println(Preguntas.FIVE);
                System.out.println("**Escoge una opcion**");
                System.out.println("1.Cinco \n2.Tres\n3.Cuatro");
                user = Integer.parseInt(myInput.nextLine());
                numero = 5;
                break;
            case 6:
                System.out.println(Preguntas.SIX);
                System.out.println("**Escoge una opcion**");
                System.out.println("1.Mi chepita\n2.Besarte\n3.Tocarte");
                user = Integer.parseInt(myInput.nextLine());
                numero = 6;
                break;
            case 7:
                System.out.println(Preguntas.SEVEN);
                System.out.println("**Escoge una opcion**");
                System.out.println("1.Pegarte con una soga\n2.Amarrarte las manos\n3.Por el culito");
                user = Integer.parseInt(myInput.nextLine());
                numero = 7;
                break;

        }

        return numero;
    }

    public static String jugar(int pregunta) {

        switch (pregunta) {
            case 1:
                if (user == 2) {
                    System.out.println("Respuesta Correcta");
                    ganado++;
                } else {
                    System.out.println("Respuesta Incorrecta");
                    perdido++;
                }
                break;
            case 2:
                if (user == 2) {
                    System.out.println("Respuesta Correcta");
                    ganado++;
                } else {
                    System.out.println("Respuesta Incorrecta");
                    perdido++;
                }
                break;
            case 3:
                if (user == 3) {
                    System.out.println("Respuesta Correcta");
                    ganado++;
                } else {
                    System.out.println("Respuesta Incorrecta");
                    perdido++;
                }
                break;

            case 4:
                if (user == 3) {
                    System.out.println("Respuesta Correcta");
                    ganado++;
                } else {
                    System.out.println("Respuesta Incorrecta");
                    perdido++;
                }
                break;

            case 5:
                if (user == 2) {
                    System.out.println("Respuesta Correcta");
                    ganado++;
                } else {
                    System.out.println("Respuesta Incorrecta");
                    perdido++;
                }
                break;
            case 6:
                if (user == 1) {
                    System.out.println("Respuesta Correcta");
                    ganado++;
                } else {
                    System.out.println("Respuesta Incorrecta");
                    perdido++;
                }
                break;
            case 7:
                if (user == 3) {
                    System.out.println("Respuesta Correcta");
                    ganado++;
                } else {
                    System.out.println("Respuesta Incorrecta");
                    perdido++;
                }
                break;

            default:
                System.out.println("Has perdido un punto xq no has instroducido un numero entre 1 al 3");
                perdido++;
                break;
        }

        System.out.println("Quieres volver al menu principal ?");
        strUser = myInput.nextLine();
        if (strUser.equalsIgnoreCase("SI")) {
            menuPrincipal();
        } else {
            System.out.println("Antes que te vayas este es tu resultado");
            puntuaciones();
            System.out.println("Hasta pronto !");
        }
        return strUser;

    }

    public static void menuPrincipal() {
        System.out.println("**EMPECEMOS A JUGAR**");

        do {
            System.out.println("******ESCOGE UNA OPCION****");
            System.out.println("1.EMPEZAR A JUGAR");
            System.out.println("2.RESULTADOS");
            System.out.println("3.SALIR");
            user = Integer.parseInt(myInput.nextLine());
            correct = user > 0 && user < MAX_PRINCIPAL;

            switch (user) {
                case 1:
                    if (perdido < MAX_INTENTOS) {
                        jugar(menuJuego());
                        break;
                    } else {
                        System.out.println("Numero de intentos  = " + MAX_INTENTOS);
                        System.out.println("Lo siento has perdido intentalo de nuevo otra vez :(");
                        break;
                    }
                case 2:
                    puntuaciones();
                    break;
                case 3:
                    System.out.println("Hasta pronto!");
                    correct = !correct;
                    break;
            }

        } while (!correct);
    }

    public static void puntuaciones() {
        System.out.println("Puntos ganados son " + ganado + "\n" + "Puntos perdidos son " + perdido);
    }

    public static void main(String[] args) {
        menuPrincipal();

    }

}
