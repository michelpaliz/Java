public class toString {
    
    class Pet{

        String name;
        Integer age; 
      
        Pet(String n, Integer a){
          this.name=n;
          this.age=a;
        }
      //Over-riding the toString() function as a class function
        public String toString(){
          return "The name of the pet is " + this.name + ". The age of the pet is " + this.age;
        }
      }
      
      class HelloWorld {
          public static void main( String args[] ) {
            Pet p = new Pet("Jane",10);
            //Calling the class version of toString()
              System.out.println(p.toString());
            //Calling the original toString()
            System.out.println(Integer.toString(12));
          }
      }
}
