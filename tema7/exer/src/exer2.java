

public class exer2 {
    

    public static void vowels(String a){
        
        // int suma = 0;

        // if(a.equals("a")){
        //     suma++;
        // }else if (a.equals("e")){
        //     suma++;
        // }else if (a.equals("i")){
        //     suma++;
        // }else if (a.equals("o")){
        //     suma++;
        // }else if (a.equals("u")){
        //     suma++;
        // }

        // System.out.println("Este string tiene este num de vocales " + suma);

        int sumVocal = 0;
            int sumCons = 0; 
            String s = "holaa";
            for(int i=0; i<s.length();i++){  
                // char c = s.charAt(i);  
                if (s.charAt(i) == 'a' ){
                    sumVocal++;
                }else if (s.charAt(i) == 'e'){
                    sumVocal++;
                }else if (s.charAt(i) == 'i'){
                    sumVocal++;
                }else if (s.charAt(i) == 'o'){
                    sumVocal++;
                }else if (s.charAt(i) == 'u'){
                    sumVocal++;
                }else{
                    sumCons++;
                }   

                // System.out.println("char at "+i+" index is: "+c);  
        }
        System.out.println(sumVocal);
        System.out.println(sumCons);


    }



    public static void main (String[]args){

        String str = "Hola  hola ";

        vowels(str);

        // String s="hello";  
        // char c =s.charAt(0);//returns h  
        



    }



}
