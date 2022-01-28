

public class exer4 {
    
    // public static int countWordsUsingSplit(String input) { 
    //     if (input == null || input.isEmpty()) { 
    //         return 0; 
    //     } 
    //     String[] words = input.split("\\s+"); 
    //     vowels(words);
    //     // words[0] = "Hello";
    //     // words[1] = "World";
    //     return words.length;

    // }


    // public static void vowels(String[]  a){
    //     int sumVocal = 0;
    //     int sumCons = 0; 
    //     String s = a;
    //     for(int i=0; i<s.length();i++){  
    //         // char c = s.charAt(i);  
    //         if (s.charAt(i) == 'a' ){
    //             sumVocal++;
    //         }else if (s.charAt(i) == 'e'){
    //             sumVocal++;
    //         }else if (s.charAt(i) == 'i'){
    //             sumVocal++;
    //         }else if (s.charAt(i) == 'o'){
    //             sumVocal++;
    //         }else if (s.charAt(i) == 'u'){
    //             sumVocal++;
    //         }else{
    //             sumCons++;
    //         }   
    //     }
    //         System.out.println(sumVocal);
    //         System.out.println(sumCons);


    // }


    public static void count (String a ){
        int count = 0;
        int countCons = 0;
        int countSpace = 0;
        String sentence = a;
        // String sentence = sc.nextLine();

        for (int i=0 ; i<sentence.length(); i++){
           char ch = sentence.charAt(i);
           if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
              count ++;
           }else if (ch == ' '){
               countSpace++;
           }
           else{
              countCons++;
           }
        }
        System.out.println("Number of vowels in the given sentence is "+count);
        System.out.println("Number of spaces in the given sentence is "+countSpace);
        System.out.println("Number of consonats in the given sentence is "+countCons);
     }

  
    public static void main (String[]args){

        String a = "hola  holaa";
        count(a);


    }




}
