



public class exer3 {
    
    static int wordcount(String string)  
    {  
      int count=0;  
  
        char ch[]= new char[string.length()];     
        for(int i=0;i<string.length();i++)  
        {  
            ch[i]= string.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        }  
        return count;  
    }  

    public static int countWordsUsingSplit(String input) {
        if (input == null || input.isEmpty()) {
          return 0;
        }
    
        String[] words = input.split("\\s+");
        return words.length;
      }
    


    public static void main (String[]args){
      String a = "h e l l o";
      System.out.println(wordcount(a)+" words");
      System.out.println(countWordsUsingSplit(a));

    
    }



}
