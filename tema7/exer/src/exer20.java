import libs.array;
import libs.check;
import java.util.Scanner;

public class exer20 {

    public static void main(String[] args) {

        double a[] = new double[10];//

        array.content(a);

        Scanner myInput = new Scanner(System.in);//
        System.out.println("Dime el numero que quieres chekear");
        int user = myInput.nextInt();

        System.out.println(check.checkValueBoolean(a, user)); // si quiero sabeer si estas
        System.out.println("hay " + check.checkValueInt(a, user));// dame el numero que se repite

        // hoola

    }
}