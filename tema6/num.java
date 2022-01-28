


public class num {

        public enum lang{
            INGLES,VALENCIANO, CASTELLANO,NONE;
        }


        public  static lang fromInt(int idioma){

            switch(idioma){
                case lang.INGLES.ordinal();
                    return lang.INGLES;

                case lang.VALENCIANO.ordinal();
                    return lang.VALENCIANO;
                case lang.CASTELLANO.ordinal();
                    return.lang.NONE.ordinal();m
            }
        }



        public static void main (String[]args){
            lang[] langs = lang.values();
            for (int i = 0; i < langs.length; i++ ){
                System.out.println(langs[i].ordinal() + " " + langs[i]);
            }
        }


        int  idioma = Integer.parseInt(lector )


    
}
