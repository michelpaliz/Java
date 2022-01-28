import libs.userArray;
// import libs.mediaArray;
// import libs.intArray;;

public class exer17 {

    public static String mediaArray(double a[]){
        int i;
        double sumaTodo = 0;
        for( i = 0; i<a.length ; i++){
            sumaTodo = a[i] + sumaTodo;
            
        }
        double mediaTotal = sumaTodo / a.length;
        // return ("la media de todo el array es " + mediaTotal);
        int mayorMedia = 0;
        for ( i = 0 ; i < a.length; i++){
            if( a [i] >= mediaTotal){
                mayorMedia+=1;

            }
        }

        return ("la media de todo el array es " + mediaTotal + " y hay " + mayorMedia + " que superan la media");

    }
    
    public static void main(String[]args){
        //variables
        double[] estaturas = new double [10];


        //System.out.println(userArray.doubleArray(estaturas));
        System.out.println(mediaArray(userArray.doubleArray(estaturas)));
        // System.out.println(mediaArray.mediaArray(userArray.doubleArray(estaturas)));
        // System.out.println(mediaArray(intArray.content(estaturas)));

     



      


      


    



    }

    
}
