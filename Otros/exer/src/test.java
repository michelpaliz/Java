public class test {

    public static enum Mes {
        ENERO, FEBREO, MARZO, ABRIL, MAYO
    }

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println(Mes.values());
            System.out.println(Mes.ENERO);

        }
    }
}
