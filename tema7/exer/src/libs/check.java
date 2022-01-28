package libs;

public class check {

    public static int checkValueInt(double a[], int num){
        // StringBuilder result = new StringBuilder();
        // String format = "%2f\n";
        int cont = 0;
            
        for(int i = 0;  i < a.length; i++){
            a[i] = i;
            if (a[i] == num){
                cont += 1;
                // result.append(String.format( format , a[i])) ;
            }
        }
        return cont;
       

        // return result.toString();
    }

    public static boolean checkValueBoolean(double a[], int num){
        // StringBuilder result = new StringBuilder();
        // String format = "%2f\n";
       
        for(int i = 0;  i < a.length; i++){
            a[i] = i;
            if (a[i] == num){
                return true;
                // result.append(String.format( format , a[i])) ;
            }
        }
        return false;
       

        // return result.toString();
    }

    public static int checkPosition(double a[], int num){
        // StringBuilder result = new StringBuilder();
        // String format = "%2f\n";
       
        for(int i = 0;  i < a.length; i++){
            a[i] = i;
            if (a[i] == num){
                return i;
                // result.append(String.format( format , a[i])) ;
            }
        }
        return -1;
       

        // return result.toString();
    }


    
}
